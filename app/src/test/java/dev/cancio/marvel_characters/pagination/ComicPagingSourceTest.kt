package dev.cancio.marvel_characters.pagination

import androidx.paging.PagingConfig
import androidx.paging.PagingSource
import androidx.paging.testing.TestPager
import dev.cancio.marvel_characters.service.MarvelApi
import dev.cancio.marvel_characters.stubs.comicList
import dev.cancio.marvel_characters.stubs.comicListResponse
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.mock
import org.mockito.kotlin.whenever

class ComicPagingSourceTest {

    @Mock
    lateinit var api: MarvelApi

    private lateinit var comicPagingSource: ComicPagingSource

    @Before
    fun setUp() {
        api = mock(MarvelApi::class.java)
        comicPagingSource = ComicPagingSource(api)
    }

    @Test
    fun `WHEN getComicList is success THEN show expected data from API`() = runTest {
        //Setup
        whenever(api.getComicList()).thenReturn(comicListResponse)

        val pager = TestPager(
            PagingConfig(pageSize = 15),
            comicPagingSource
        )

        //Execution
        val result = pager.refresh() as PagingSource.LoadResult.Page

        //Assertion
        assertEquals(result.data, comicList)
    }

    @Test
    fun `WHEN getComicList is failed THEN show error`() = runTest {
        //Setup
        whenever(api.getComicList()).thenThrow(RuntimeException("Error"))

        val pager = TestPager(
            PagingConfig(pageSize = 15),
            comicPagingSource
        )

        //Execution
        val result = pager.refresh()
        val page = pager.getLastLoadedPage()

        //Assertion
        assertTrue(result is PagingSource.LoadResult.Error)
        assertEquals(page, null)
    }
}