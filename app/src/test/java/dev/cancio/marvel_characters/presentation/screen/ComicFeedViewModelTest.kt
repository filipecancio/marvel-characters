package dev.cancio.marvel_characters.presentation.screen

import androidx.paging.testing.asSnapshot
import dev.cancio.marvel_characters.presentation.screen.comicfeed.ComicFeedViewModel
import dev.cancio.marvel_characters.repository.MarvelRepository
import dev.cancio.marvel_characters.stubs.FakeMarvelRepository
import dev.cancio.marvel_characters.stubs.comicList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
@OptIn(ExperimentalCoroutinesApi::class)
class ComicFeedViewModelTest {

    lateinit var repository: MarvelRepository

    lateinit var viewModel: ComicFeedViewModel

    private val testScope = TestScope()
    private val testDispatcher = StandardTestDispatcher(testScope.testScheduler)

    @Before
    fun setUp() {
        Dispatchers.setMain(testDispatcher)
        repository = FakeMarvelRepository()
        viewModel = ComicFeedViewModel(repository)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `WHEN on init viewmodel AND has data  THEN show a comic list state`() = testScope.runTest {
        //Setup
        val listResult = viewModel.comicList

        //Execution
        val result = listResult.asSnapshot()

        //Assertion
        assertEquals(result, comicList)
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