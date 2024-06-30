package dev.cancio.marvel_characters.pagination

import dev.cancio.marvel_characters.service.MarvelApi
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.mock

class ComicPagingSourceTest {

    @Mock
    lateinit var api: MarvelApi

    lateinit var comicPagingSource: ComicPagingSource

    @Before
    fun setUp() {
        api = mock(MarvelApi::class.java)
        comicPagingSource = ComicPagingSource(api)
    }

    @Test
    fun `WHEN something THEN something`() {
        //Setup

        //Execution

        //Assertion
        assertEquals(4, 2 + 2)
    }
}