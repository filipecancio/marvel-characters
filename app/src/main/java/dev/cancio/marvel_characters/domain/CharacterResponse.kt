package dev.cancio.marvel_characters.domain

data class CharacterListResponse(
    val data: CharacterListResponseData
)

data class CharacterListResponseData(
    val offset: Int,
    val limit: Int,
    val total: Int,
    val count: Int,
    val results: List<Character>
)

data class Character(
    val id: Int,
    val name: String
)