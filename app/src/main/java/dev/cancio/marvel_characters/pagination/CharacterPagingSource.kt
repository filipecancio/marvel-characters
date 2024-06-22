package dev.cancio.marvel_characters.pagination

import androidx.paging.PagingSource
import androidx.paging.PagingState
import dev.cancio.marvel_characters.domain.Character
import dev.cancio.marvel_characters.service.MarvelApi

class CharacterPagingSource(
    private val api: MarvelApi
): PagingSource<Int, Character>()  {

        override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Character> = try {
            val page = params.key ?: 0
            val response = api.getCharacterList(page)
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

        override fun getRefreshKey(state: PagingState<Int, Character>): Int?  = state.anchorPosition?.let {
            state.closestPageToPosition(it)?.prevKey?.plus(15) ?: state.closestPageToPosition(it)?.nextKey?.minus(15)
        }
}