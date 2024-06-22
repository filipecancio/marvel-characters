package dev.cancio.marvel_characters.service

import dev.cancio.marvel_characters.domain.Character
import dev.cancio.marvel_characters.domain.Comic
import dev.cancio.marvel_characters.domain.MarvelResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MarvelService {
    @GET("characters")
    suspend fun getCharacterList(
        @Query("offset")  offset: Int,
        @Query("limit") limit: Int,
        @Query("ts") ts: String = getTs(),
        @Query("hash") apiKey: String = getHash(),
    ): MarvelResponse<Character>
    @GET("characters/{id}")
    suspend fun getCharacterById(
        @Path("id") id: Int,
        @Query("ts") ts: String = getTs(),
        @Query("hash") apiKey: String = getHash(),
    ): MarvelResponse<Character>
    @GET("comics")
    suspend fun getComicList(
        @Query("offset")  offset: Int,
        @Query("limit") limit: Int,
        @Query("ts") ts: String = getTs(),
        @Query("hash") apiKey: String = getHash(),
    ): MarvelResponse<Comic>
    @GET("comics/{id}")
    suspend fun getComicById(
        @Path("id") id: Int,
        @Query("ts") ts: String = getTs(),
        @Query("hash") apiKey: String = getHash(),
    ): MarvelResponse<Comic>
}