package dev.cancio.marvel_characters.presentation.screen.comicfeed

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import dev.cancio.marvel_characters.presentation.ui.components.atom.TextBox
import dev.cancio.marvel_characters.presentation.ui.components.molecule.ComicItem
import dev.cancio.marvel_characters.presentation.ui.theme.White


@Composable
fun ComicFeedScreen(
    viewModel: ComicFeedViewModel
) {
    val comicList = viewModel.comicList.collectAsLazyPagingItems()
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier.fillMaxSize()
    )
    {
        item {
            Text(
                text = "All Comics",
                fontSize = 30.sp,
                color = White
            )
        }

        if (comicList.loadState.refresh == LoadState.Loading) {
            item {
                Box(modifier = Modifier.fillMaxSize()) {
                    TextBox("Loading...")
                }
            }
        }

        items(count = comicList.itemCount) { index ->
            comicList[index]?.let { comic ->
                //Text(text = comic.title)
                //comic.thumbnail?.let { Text(text = it.toString()) }
                ComicItem(
                    urlComic = comic.thumbnail.url,
                    urlCharacter = comic.thumbnail.url,
                    label = comic.title
                )
            }
        }
    }
}