package dev.cancio.marvel_characters.presentation.ui.components.molecule

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.cancio.marvel_characters.presentation.ui.components.atom.CharacterThumb
import dev.cancio.marvel_characters.presentation.ui.components.atom.CharacterThumbState
import dev.cancio.marvel_characters.presentation.ui.components.atom.HeartButton
import dev.cancio.marvel_characters.presentation.ui.components.atom.ImageWeb
import dev.cancio.marvel_characters.presentation.ui.components.atom.TextBox
import dev.cancio.marvel_characters.presentation.ui.icons.Marvel

@Composable
fun CharacterItem(
    urlComic: String,
    urlCharacter: String,
    label: String = "Loading..."
) = Box {
    Column {
        Box(Modifier.width(130.dp)) {
            ImageWeb(
                url = urlComic,
                modifier = Modifier
                    .padding(8.dp)
                    .width(100.dp)
                    .height(100.dp)
                    .border(1.dp, Color.Black)
                    .clip(RoundedCornerShape(3.dp)),
                loadingComposable = {
                    Box(modifier = Modifier
                        .width(100.dp)
                        .height(153.dp)
                        .background(Color(0XFFD9D9D9))
                        .border(1.dp, Color.Black)
                        .clip(RoundedCornerShape(8.dp))
                    ){
                        Icon(
                            imageVector = Icons.Marvel,
                            contentDescription = null,
                            tint = Color(0xFFFFFFFF),
                            modifier = Modifier
                                .width(66.dp)
                                .align(Alignment.Center)

                        )
                    }
                }
            )
            Box(modifier = Modifier
                .offset(y = 26.dp)
                .rotate(15f)){ HeartButton() }
            Box(modifier = Modifier
                .align(Alignment.TopEnd)
                .offset(y = 22.dp)
                .rotate(-15f)){ CharacterThumb(url = urlCharacter) }
            Box(modifier = Modifier
                .align(Alignment.TopEnd)
                .offset(y = 51.dp)){ CharacterThumb(url = urlCharacter, CharacterThumbState.Medium) }
            Box(modifier = Modifier
                .align(Alignment.TopEnd)
                .offset(y = 80.dp)
                .rotate(-15f)){ CharacterThumb(url = urlCharacter, CharacterThumbState.Small) }
        }
        TextBox(text = label, maxWidth = 120.dp)
    }
}