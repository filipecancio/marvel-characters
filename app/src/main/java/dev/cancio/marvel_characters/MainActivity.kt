package dev.cancio.marvel_characters

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dagger.hilt.android.AndroidEntryPoint
import dev.cancio.marvel_characters.presentation.screen.comicfeed.ComicFeedScreen
import dev.cancio.marvel_characters.presentation.screen.comicfeed.ComicFeedViewModel
import dev.cancio.marvel_characters.repository.MarvelRepository
import dev.cancio.marvel_characters.presentation.ui.theme.MarvelcharactersTheme
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var repository: MarvelRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MarvelcharactersTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val viewModel = hiltViewModel<ComicFeedViewModel>()
    ComicFeedScreen(viewModel)
}