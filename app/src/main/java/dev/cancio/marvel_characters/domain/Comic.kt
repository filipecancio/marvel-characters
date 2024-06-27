package dev.cancio.marvel_characters.domain

import com.google.gson.annotations.SerializedName

data class Comic(
    val id: Int,
    val title: String,
    val thumbnail: ImageBlog,

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

data class ImageBlog (
    val path: String = "http://i.annihil.us/u/prod/marvel/i/mg/b/40/image_not_available",
    val extension: String = "jpg"
) {
    val url: String
        get() = "${path.replace("http", "https")}.$extension"
}