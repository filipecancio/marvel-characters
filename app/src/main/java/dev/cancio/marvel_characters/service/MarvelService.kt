package dev.cancio.marvel_characters.service

import dev.cancio.marvel_characters.domain.CharacterListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelService {
    @GET("/v1/public/characters")
    suspend fun getCharacterList(
        @Query("offset")  offset: Int,
        @Query("limit") limit: Int,
        @Query("ts") ts: String = getTs(),
        @Query("hash") apiKey: String = getHash(),
    ): CharacterListResponse
}