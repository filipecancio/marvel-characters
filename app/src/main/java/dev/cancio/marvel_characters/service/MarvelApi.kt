package dev.cancio.marvel_characters.service

import javax.inject.Inject

class MarvelApi @Inject constructor(
    private val service: MarvelService
){
    suspend fun getCharacterList(offset: Int = 0, limit: Int = 15) = service.getCharacterList(offset,limit)
}