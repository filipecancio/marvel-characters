package dev.cancio.marvel_characters.stubs

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.testing.asPagingSourceFactory
import dev.cancio.marvel_characters.domain.Character
import dev.cancio.marvel_characters.domain.Comic
import dev.cancio.marvel_characters.repository.MarvelRepository
import kotlinx.coroutines.flow.Flow

class FakeMarvelRepository: MarvelRepository {
    override fun getCharacterPagination(): Flow<PagingData<Character>> {
        TODO("Not yet implemented")
    }

    override fun getComicPagination(): Flow<PagingData<Comic>> {
        val pagingSourceFactory = comicList.asPagingSourceFactory()
        return Pager(
            config = PagingConfig(pageSize = 15),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }

    override suspend fun getCharacterById(id: Int): Flow<Character> {
        TODO("Not yet implemented")
    }

    override suspend fun getComicById(id: Int): Flow<Comic> {
        TODO("Not yet implemented")
    }
}