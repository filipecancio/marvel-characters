package dev.cancio.marvel_characters.pagination

import androidx.paging.PagingSource
import androidx.paging.PagingState
import dev.cancio.marvel_characters.domain.Comic
import dev.cancio.marvel_characters.service.MarvelApi

class ComicPagingSource(
private val api: MarvelApi
): PagingSource<Int,Comic>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Comic> = try {
        val page = params.key ?: 0
        val response = api.getComicList(page)
        with(response.data){
            LoadResult.Page(
                data = results,
                prevKey = if (page == 0) null else page - 1,
                nextKey = if (results.isEmpty()) null else page + 1
            )
        }
    } catch (e: Exception) {
        LoadResult.Error(e)
    }
    override fun getRefreshKey(state: PagingState<Int, Comic>): Int?  = state.anchorPosition?.let {
        state.closestPageToPosition(it)?.prevKey?.plus(15) ?: state.closestPageToPosition(it)?.nextKey?.minus(15)
    }
}