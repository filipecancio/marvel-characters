package dev.cancio.marvel_characters.ui.components.atom

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.cancio.marvel_characters.ui.icons.Groot

@Preview
@Composable
fun CharacterThumbPreview() {
    Row {
        CharacterThumb(url = "https://i.annihil.us/u/prod/marvel/i/mg/9/00/4bb4c3523c46f.jpg")
    }
}

@Composable
fun CharacterThumb(
    url: String,
    state: CharacterThumbState = CharacterThumbState.Big,
) = Box(
    modifier = Modifier
        .size(state.size)
        .background(Color(0XFFD9D9D9))
        .border(1.dp, Color.Black)
        .shadow(4.dp)
) {
    ImageWeb(
        url = url,
        loadingComposable = {
            Icon(
                imageVector = Icons.Groot,
                tint = Color(0XFFF2EEF3),
                contentDescription = "",
                modifier = Modifier.size(state.groot)
            )
        }
    )
}

enum class CharacterThumbState(
    val size: Dp,
    val groot: Dp
) {
    Big(23.dp, 14.dp),
    Medium(20.dp, 12.dp),
    Small(15.dp, 9.dp),
}