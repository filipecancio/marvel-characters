package dev.cancio.marvel_characters.ui.components.atom

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.cancio.marvel_characters.ui.icons.Heart

@Preview
@Composable
fun HeartButtonPreview() {
    Row {
        HeartButton()
        HeartButton(true)
    }
}

@Composable
fun HeartButton(
    isEnabled: Boolean = false,
) = with(isEnabled.toState()){
    Box(
        modifier = Modifier
            .size(23.dp)
            .background(primaryColor)
            .border(1.dp, secondaryColor)
            .shadow(4.dp)
    ) {
        Icon(
            imageVector = Icons.Heart,
            tint = secondaryColor,
            contentDescription = null,
            modifier = Modifier
                .width(17.dp)
                .align(Alignment.Center)
        )
    }
}

enum class HeartState(
    val primaryColor: Color,
    val secondaryColor: Color,
) {
    Enabled(Color(0xFFFFCFCF),Color(0xFFF3284C)),
    Disabled(Color(0xFFFFD9D9),Color(0xFFA899A0))
}

private fun Boolean.toState() = when (this) {
    true -> HeartState.Enabled
    false -> HeartState.Disabled
}