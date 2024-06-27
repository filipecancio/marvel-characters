package dev.cancio.marvel_characters.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.cancio.marvel_characters.R

val MarvelFontFamily = FontFamily(
    Font(resId = R.font.marvel_regular),
    Font(resId = R.font.marvel_bold, weight = FontWeight.Bold),
    Font(resId = R.font.marvel_bold_italic, style = FontStyle.Italic, weight = FontWeight.Bold),
    Font(resId = R.font.marvel_italic, style = FontStyle.Italic),
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = MarvelFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)