package dev.cancio.marvel_characters.utils

private fun String?.getOffset(): Int? = this
    ?.removePrefix("https://pokeapi.co/api/v2/pokemon/?offset=")
    ?.removeSuffix("&limit=20")
    ?.toInt()
