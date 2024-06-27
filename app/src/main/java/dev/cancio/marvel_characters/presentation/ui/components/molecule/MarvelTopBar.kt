package dev.cancio.marvel_characters.presentation.ui.components.molecule

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.cancio.marvel_characters.presentation.ui.icons.Logo
import dev.cancio.marvel_characters.presentation.ui.theme.Red02
import dev.cancio.marvel_characters.presentation.ui.theme.White

@Preview(showSystemUi = true)
@Composable
fun MarvelTopBarPreview() {
    MarvelTopBar()
}

@Composable
fun MarvelTopBar() = Row(
    modifier = Modifier
        .fillMaxWidth()
        .statusBarsPadding()
        .height(50.dp)
        .background(Red02),
    horizontalArrangement = Arrangement.Center
) {
    Icon(
        imageVector = Icons.Logo,
        contentDescription = null,
        tint = White,
        modifier = Modifier
            .height(50.dp)
            .width(40.dp)
    )
}