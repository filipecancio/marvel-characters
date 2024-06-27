package dev.cancio.marvel_characters.presentation.screen.characterfeed

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import dev.cancio.marvel_characters.presentation.ui.components.atom.MarvelLoading
import dev.cancio.marvel_characters.presentation.ui.components.molecule.CharacterItem
import dev.cancio.marvel_characters.presentation.ui.theme.White

@Composable
fun CharacterFeedScreen(
    viewModel: CharacterFeedViewModel
) {
    val scope = rememberCoroutineScope()
    val characterList = viewModel.getCharactercPaging(scope).collectAsLazyPagingItems()
    Column {
        Text(
            text = "All Characters",
            fontSize = 30.sp,
            color = White,
            modifier = Modifier.padding(16.dp)
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(horizontal = 8.dp),
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center
        ) {
            items(count = characterList.itemCount) { index ->
                characterList[index]?.let { character ->
                    Box(contentAlignment = Alignment.Center) {
                        CharacterItem(
                            urlComic = character.thumbnail.url,
                            urlCharacter = character.thumbnail.url,
                            label = character.name
                        )
                    }
                }
            }

            if (characterList.loadState.refresh == LoadState.Loading) {
                item {
                    MarvelLoading()
                }
            }
        }
    }
}