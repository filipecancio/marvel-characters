package dev.cancio.marvel_characters.presentation.screen.comicfeed

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.cancio.marvel_characters.domain.Comic
import dev.cancio.marvel_characters.repository.MarvelRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class ComicFeedViewModel @Inject constructor(
    private val repository: MarvelRepository
) : ViewModel() {

    fun getComicPaging(scope: CoroutineScope): Flow<PagingData<Comic>> =
        repository.getComicPagination().cachedIn(scope)

}