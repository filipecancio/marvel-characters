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
}