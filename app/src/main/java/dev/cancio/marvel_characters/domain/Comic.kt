package dev.cancio.marvel_characters.domain

import com.google.gson.annotations.SerializedName

data class Comic(
    val id: Int,
    val title: String,

    @SerializedName("characters")
    val comicCharacterList: ComicCharacterInfo
)

data class ComicCharacterInfo(
    val available: Int,
    val characterInfoList: List<CharacterInfo>,

    @SerializedName("collectionURI")
    val collectionUri: String
)

data class CharacterInfo(
    val name: String,

    @SerializedName("resourceURI")
    val resourceUri: String
)