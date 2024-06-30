package dev.cancio.marvel_characters.presentation.screen.comicfeed

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
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
    repository: MarvelRepository
) : ViewModel() {

    val comicList: Flow<PagingData<Comic>> =
        repository.getComicPagination().cachedIn(viewModelScope)

}