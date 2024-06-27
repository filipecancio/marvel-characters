package dev.cancio.marvel_characters.presentation.ui.components.atom

import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import dev.cancio.marvel_characters.presentation.ui.icons.Marvel
import dev.cancio.marvel_characters.presentation.ui.theme.White

@Composable
fun MarvelLoading() {
    Box(contentAlignment = Alignment.Center) {
        Icon(imageVector = Icons.Marvel, tint = White, contentDescription = null)
        TextBox("Loading...")
    }
}