package dev.cancio.marvel_characters.repository

import androidx.paging.PagingConfig
import androidx.paging.PagingSource
import androidx.paging.testing.TestPager
import dev.cancio.marvel_characters.pagination.ComicPagingSource
import dev.cancio.marvel_characters.service.MarvelApi
import dev.cancio.marvel_characters.stubs.comicList
import dev.cancio.marvel_characters.stubs.comicListResponse
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.mock
import org.mockito.kotlin.whenever

class MarvelRepositoryTest {

    @Mock
    lateinit var api: MarvelApi

    private lateinit var comicPagingSource: ComicPagingSource

    @Before
    fun setUp() {
        api = mock(MarvelApi::class.java)
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

}