package dev.cancio.marvel_characters.service

import dev.cancio.marvel_characters.domain.CharacterListResponse
import retrofit2.Response
import retrofit2.http.GET

interface MarvelService {
    @GET("/v1/public/characters")
    suspend fun getCharacterList(): Response<CharacterListResponse>
}