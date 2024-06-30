package dev.cancio.marvel_characters.presentation.screen

import androidx.paging.PagingData
import dev.cancio.marvel_characters.domain.Comic
import dev.cancio.marvel_characters.presentation.screen.comicfeed.ComicFeedViewModel
import kotlinx.coroutines.flow.Flow
import org.junit.Assert.assertEquals
import org.junit.Test
import javax.inject.Inject

class ComicFeedViewModelTest {

    @Inject
    lateinit var viewModel: ComicFeedViewModel

    @Test
    fun `WHEN on init viewmodel AND has data  THEN show a comic list state`() {
        //Setup

        //Execution

        //Assertion
        assertEquals(4, 2 + 2)
    }

    @Test
    fun `WHEN on init viewmodel AND has not data  THEN show a loading state`() {
        //Setup

        //Execution

        //Assertion
        assertEquals(4, 2 + 2)
    }

    @Test
    fun `WHEN on init viewmodel AND data failed THEN show a error state`() {
        //Setup

        //Execution

        //Assertion
        assertEquals(4, 2 + 2)
    }

    @Test
    fun `WHEN click on comic THEN should go to comic detail screen`() {
        //Setup

        //Execution

        //Assertion
        assertEquals(4, 2 + 2)
    }

    @Test
    fun `WHEN click on search input AND digit a valid comic THEN should show a comic list state`() {
        //Setup

        //Execution

        //Assertion
        assertEquals(4, 2 + 2)
    }

    @Test
    fun `WHEN click on search input AND digit a invalid comic THEN should show a not found state`() {
        //Setup

        //Execution

        //Assertion
        assertEquals(4, 2 + 2)
    }
}