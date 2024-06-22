package dev.cancio.marvel_characters.repository

import dev.cancio.marvel_characters.service.MarvelApi
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MarvelRepository @Inject constructor(
    private val api: MarvelApi
) {
    suspend fun getCharacterList(offset: Int = 0, limit: Int = 15) = flow {
        emit(api.getCharacterList(offset, limit).data.offset.toString())
    }

    suspend fun getCharacterById(id: Int) = flow {
        emit(api.getCharacterById(id).data.offset.toString())
    }

    suspend fun getComicList(offset: Int = 0, limit: Int = 15) = flow {
        emit(api.getComicList(offset, limit).data.offset.toString())
    }

    suspend fun getComicById(id: Int) = flow {
        emit(api.getComicById(id).data.offset.toString())
    }
}