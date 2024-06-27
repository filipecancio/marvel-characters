package dev.cancio.marvel_characters.presentation.ui.components.atom

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImagePainter
import coil.compose.SubcomposeAsyncImage
import coil.compose.SubcomposeAsyncImageContent

@Composable
fun ImageWeb(
    url: String,
    modifier: Modifier = defaultModifier,
    colorFilter: ColorFilter? = null,
    contentScale: ContentScale= ContentScale.Crop,
    loadingComposable: @Composable () -> Unit = { CircularProgressIndicator() },
) {
    Box{
        SubcomposeAsyncImage(
            model = url,
            contentDescription =  "",
            contentScale = contentScale,
            modifier = modifier,
            colorFilter= colorFilter
        ) {
            val state = painter.state
            Log.d("ImageWeb", "url: $url")
            Log.d("ImageWeb", "ImageWeb: $state")
            if (state is AsyncImagePainter.State.Loading || state is AsyncImagePainter.State.Error) {
                loadingComposable()
            } else {
                SubcomposeAsyncImageContent()
            }
        }
    }
}

val defaultModifier = Modifier
    .width(80.dp)
    .height(80.dp)
    .clip(RoundedCornerShape(8.dp))
