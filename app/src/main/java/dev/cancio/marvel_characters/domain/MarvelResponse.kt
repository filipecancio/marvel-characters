package dev.cancio.marvel_characters.domain

data class MarvelResponse<T>(
    val data: MarvelResponseData<T>
)

data class MarvelResponseData<T>(
    val offset: Int,
    val limit: Int,
    val total: Int,
    val count: Int,
    val results: List<T>
)