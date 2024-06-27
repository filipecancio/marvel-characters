package dev.cancio.marvel_characters.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.cancio.marvel_characters.presentation.navigation.MainNavigation
import dev.cancio.marvel_characters.presentation.ui.components.molecule.MarvelBottomBar
import dev.cancio.marvel_characters.presentation.ui.components.molecule.MarvelTopBar
import dev.cancio.marvel_characters.presentation.ui.theme.MarvelcharactersTheme
import dev.cancio.marvel_characters.presentation.ui.theme.Red01
import dev.cancio.marvel_characters.repository.MarvelRepository
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var repository: MarvelRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            MarvelcharactersTheme(window = window) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Red01
                ) {
                    val navController = rememberNavController()
                    Scaffold(
                        topBar = { MarvelTopBar() },
                        bottomBar = { MarvelBottomBar(navController) },
                        containerColor = Red01
                    ) { contentPadding ->
                        Box(
                            modifier = Modifier
                                .padding(contentPadding),
                            contentAlignment = Alignment.Center,
                        ) {
                            MainNavigation(navController)
                        }
                    }
                }
            }
        }
    }
}