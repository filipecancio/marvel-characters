package dev.cancio.marvel_characters.presentation.screen.characterfeed

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.cancio.marvel_characters.domain.Character
import dev.cancio.marvel_characters.domain.Comic
import dev.cancio.marvel_characters.repository.MarvelRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class CharacterFeedViewModel @Inject constructor(
    private val repository: MarvelRepository
) : ViewModel()  {

    fun getCharactercPaging(scope: CoroutineScope): Flow<PagingData<Character>> =
        repository.getCharacterPagination().cachedIn(scope)
}