package dev.cancio.marvel_characters.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import dev.cancio.marvel_characters.domain.Character
import dev.cancio.marvel_characters.domain.Comic
import dev.cancio.marvel_characters.pagination.CharacterPagingSource
import dev.cancio.marvel_characters.pagination.ComicPagingSource
import dev.cancio.marvel_characters.service.MarvelApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MarvelRepository @Inject constructor(
    private val api: MarvelApi
) {
    fun getCharacterPagination(): Flow<PagingData<Character>> = Pager(
        config = PagingConfig(pageSize = 15),
        pagingSourceFactory = { CharacterPagingSource(api) }
    ).flow

    suspend fun getCharacterById(id: Int): Flow<Character> = flow {
        emit(api.getCharacterById(id).data.results.first())
    }

    fun getComicPagination(): Flow<PagingData<Comic>> = Pager(
        config = PagingConfig(pageSize = 15),
        pagingSourceFactory = { ComicPagingSource(api) }
    ).flow

    suspend fun getComicById(id: Int): Flow<Comic> = flow {
        emit(api.getComicById(id).data.results.first())
    }
}