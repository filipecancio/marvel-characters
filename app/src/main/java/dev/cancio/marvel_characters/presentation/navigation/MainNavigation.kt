package dev.cancio.marvel_characters.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.cancio.marvel_characters.presentation.screen.characterfeed.CharacterFeedScreen
import dev.cancio.marvel_characters.presentation.screen.characterfeed.CharacterFeedViewModel
import dev.cancio.marvel_characters.presentation.screen.comicfeed.ComicFeedScreen
import dev.cancio.marvel_characters.presentation.screen.comicfeed.ComicFeedViewModel
import dev.cancio.marvel_characters.presentation.screen.favoritefeed.FavoriteFeedScreen
import dev.cancio.marvel_characters.presentation.screen.favoritefeed.FavoriteFeedViewModel
import dev.cancio.marvel_characters.presentation.ui.icons.Comic
import dev.cancio.marvel_characters.presentation.ui.icons.Groot
import dev.cancio.marvel_characters.presentation.ui.icons.Heart

@Composable
fun MainNavigation(navController: NavHostController) {
    val comicFeedViewModel = hiltViewModel<ComicFeedViewModel>()
    val characterFeedViewModel = hiltViewModel<CharacterFeedViewModel>()
    val favoriteFeedViewModel = hiltViewModel<FavoriteFeedViewModel>()

    NavHost(navController = navController, startDestination = "ComicFeed") {
        composable("ComicFeed")  {  ComicFeedScreen(comicFeedViewModel) }
        composable("CharacterFeed")  {  CharacterFeedScreen(characterFeedViewModel) }
        composable("FavoriteFeed")  {  FavoriteFeedScreen(favoriteFeedViewModel) }
    }
}

sealed class BottomNavItem(
    val route: String,
    val icon: ImageVector,
    val title: String
) {
    data object Home : BottomNavItem("ComicFeed", Icons.Comic, "Comics")
    data object Character : BottomNavItem("CharacterFeed", Icons.Groot, "Characters")
    data object Favorite : BottomNavItem("FavoriteFeed", Icons.Heart, "Liked")



    companion object {
        fun getMainItemList() = listOf(Home, Character, Favorite)
    }
}