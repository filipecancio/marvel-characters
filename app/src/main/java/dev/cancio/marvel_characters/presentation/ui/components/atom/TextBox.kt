package dev.cancio.marvel_characters.presentation.ui.components.atom

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.cancio.marvel_characters.presentation.ui.theme.Black
import dev.cancio.marvel_characters.presentation.ui.theme.MarvelFontFamily
import dev.cancio.marvel_characters.presentation.ui.theme.White

@Composable
fun TextBox(
    text: String = "",
    maxWidth: Dp = 200.dp
) = Box(
    modifier = Modifier
        .widthIn(max = maxWidth)
        .shadow(2.dp)
        .background(White)
        .border(1.dp, Black)
){
    Text(
        text = text,
        overflow = TextOverflow.Ellipsis,
        fontFamily = MarvelFontFamily,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        fontSize = 11.sp,
    )
}