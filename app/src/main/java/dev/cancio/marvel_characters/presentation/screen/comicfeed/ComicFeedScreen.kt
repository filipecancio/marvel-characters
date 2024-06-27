package dev.cancio.marvel_characters.presentation.screen.comicfeed

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
import dev.cancio.marvel_characters.presentation.ui.components.molecule.ComicItem
import dev.cancio.marvel_characters.presentation.ui.theme.White


@Composable
fun ComicFeedScreen(
    viewModel: ComicFeedViewModel
) {
    val scope = rememberCoroutineScope()
    val comicList = viewModel.getComicPaging(scope).collectAsLazyPagingItems()
    Column {
        Text(
            text = "All Comics",
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
            items(count = comicList.itemCount) { index ->
                comicList[index]?.let { comic ->
                    Box(contentAlignment = Alignment.Center) {
                        ComicItem(
                            urlComic = comic.thumbnail.url,
                            urlCharacter = comic.thumbnail.url,
                            label = comic.title
                        )
                    }
                }
            }
            if (comicList.loadState.refresh == LoadState.Loading) {
                item {
                    MarvelLoading()
                }
            }
        }
    }
}