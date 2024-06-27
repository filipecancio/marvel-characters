package dev.cancio.marvel_characters.presentation.ui.components.molecule

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavController
import dev.cancio.marvel_characters.presentation.navigation.BottomNavItem
import dev.cancio.marvel_characters.presentation.ui.theme.MarvelFontFamily
import dev.cancio.marvel_characters.presentation.ui.theme.Purple01
import dev.cancio.marvel_characters.presentation.ui.theme.Red01
import dev.cancio.marvel_characters.presentation.ui.theme.Red02

@Composable
fun MarvelBottomBar(
    navController: NavController,
    itemList: List<BottomNavItem> = BottomNavItem.getMainItemList()
) {
    var selectedItem by remember { mutableIntStateOf(0) }
    NavigationBar(
        containerColor = Red02,
    ) {
        itemList.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = null,
                        tint = Purple01
                    )
                },
                label = { Text(item.title, fontFamily = MarvelFontFamily, color = Purple01) },
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    navController.navigate(item.route)
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Red01,
                    indicatorColor = Red01
                )
            )
        }
    }
}