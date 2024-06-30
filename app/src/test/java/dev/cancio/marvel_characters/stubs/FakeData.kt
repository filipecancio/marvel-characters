package dev.cancio.marvel_characters.stubs

import dev.cancio.marvel_characters.domain.Comic
import dev.cancio.marvel_characters.domain.ComicCharacterInfo
import dev.cancio.marvel_characters.domain.ImageBlog
import dev.cancio.marvel_characters.domain.MarvelResponse
import dev.cancio.marvel_characters.domain.MarvelResponseData


val comicList: List<Comic> = listOf(
    Comic(
        id = 1,
        title = "Comic 1",
        thumbnail = ImageBlog(
            path = "path",
            extension = "extension"
        ),
        comicCharacterList = ComicCharacterInfo(0,listOf(),"")
    ),
    Comic(
        id = 2,
        title = "Comic 2",
        thumbnail = ImageBlog(
            path = "path",
            extension = "extension"
        ),
        comicCharacterList = ComicCharacterInfo(0,listOf(),"")
    ),
    Comic(
        id = 3,
        title = "Comic 3",
        thumbnail = ImageBlog(
            path = "path",
            extension = "extension"
        ),
        comicCharacterList = ComicCharacterInfo(0,listOf(),"")
    )
)
val comicListResponse: MarvelResponse<Comic> = MarvelResponse(
    data = MarvelResponseData(
        offset = 0,
        limit = 15,
        total = 3,
        count = 3,
        results = comicList
    )
)