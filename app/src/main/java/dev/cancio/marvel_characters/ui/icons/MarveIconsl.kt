package dev.cancio.marvel_characters.ui.icons

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = false)
@Composable
private fun IconMarvelPreview() {
    val colors = listOf(
        Icons.Marvel,
        Icons.Comic,
        Icons.Groot,
        Icons.Heart,
        Icons.Logo
    )
    Row {
        colors.forEach {
            Icon(
                imageVector = it,
                tint = Color.Blue,
                contentDescription = "",
                modifier = Modifier.size(50.dp)
            )
        }
    }
}

val Icons.Marvel: ImageVector
    get() = ImageVector.Builder(
        name = "Marvel",
        defaultWidth = 100.0.dp,
        defaultHeight = 37.0.dp,
        viewportWidth = 100.0F,
        viewportHeight = 37.0F,
    ).path(
        fill = SolidColor(Color(0xFFFFFFFF)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(86.89F, 6.59F)
        verticalLineTo(0.0F)
        horizontalLineTo(68.63F)
        lineTo(65.62F, 22.01F)
        lineTo(62.65F, 0.01F)
        horizontalLineTo(56.06F)
        lineTo(56.8F, 5.88F)
        curveTo(56.04F, 4.37F, 53.34F, 0.01F, 47.41F, 0.01F)
        curveTo(47.37F, 0.0F, 40.81F, 0.01F, 40.81F, 0.01F)
        lineTo(40.79F, 32.07F)
        lineTo(35.98F, 0.01F)
        lineTo(27.36F, 0.0F)
        lineTo(22.39F, 33.23F)
        lineTo(22.39F, 0.0F)
        horizontalLineTo(14.14F)
        lineTo(11.16F, 18.67F)
        lineTo(8.26F, 0.01F)
        horizontalLineTo(0.0F)
        verticalLineTo(36.13F)
        horizontalLineTo(6.5F)
        verticalLineTo(18.72F)
        lineTo(9.46F, 36.13F)
        horizontalLineTo(12.92F)
        lineTo(15.84F, 18.72F)
        verticalLineTo(36.13F)
        horizontalLineTo(28.38F)
        lineTo(29.14F, 30.57F)
        horizontalLineTo(34.19F)
        lineTo(34.94F, 36.13F)
        lineTo(47.26F, 36.14F)
        horizontalLineTo(47.27F)
        verticalLineTo(36.13F)
        horizontalLineTo(47.27F)
        horizontalLineTo(47.28F)
        verticalLineTo(24.4F)
        lineTo(48.79F, 24.18F)
        lineTo(51.91F, 36.14F)
        horizontalLineTo(51.92F)
        horizontalLineTo(58.27F)
        horizontalLineTo(58.28F)
        lineTo(58.28F, 36.13F)
        horizontalLineTo(58.29F)
        horizontalLineTo(58.3F)
        lineTo(54.2F, 22.12F)
        curveTo(56.28F, 20.58F, 58.62F, 16.66F, 58.0F, 12.91F)
        verticalLineTo(12.91F)
        curveTo(58.0F, 12.96F, 61.87F, 36.15F, 61.87F, 36.15F)
        lineTo(69.44F, 36.13F)
        lineTo(74.61F, 3.39F)
        verticalLineTo(36.13F)
        horizontalLineTo(86.89F)
        verticalLineTo(29.63F)
        horizontalLineTo(81.07F)
        verticalLineTo(21.35F)
        horizontalLineTo(86.89F)
        verticalLineTo(14.75F)
        horizontalLineTo(81.07F)
        verticalLineTo(6.59F)
        horizontalLineTo(86.89F)

        moveTo(29.9F, 24.84F)
        lineTo(31.69F, 9.4F)
        lineTo(33.54F, 24.84F)
        horizontalLineTo(29.9F)

        moveTo(48.81F, 17.71F)
        curveTo(48.31F, 17.95F, 47.79F, 18.08F, 47.28F, 18.08F)
        verticalLineTo(6.46F)
        curveTo(47.29F, 6.46F, 47.3F, 6.45F, 47.31F, 6.45F)
        curveTo(47.82F, 6.45F, 51.62F, 6.61F, 51.62F, 12.2F)
        curveTo(51.62F, 15.13F, 50.33F, 16.97F, 48.81F, 17.71F)

        moveTo(100.0F, 29.63F)
        verticalLineTo(36.12F)
        horizontalLineTo(88.02F)
        verticalLineTo(0.0F)
        horizontalLineTo(94.47F)
        verticalLineTo(29.63F)
        horizontalLineTo(100.0F)
        close()
    }.build()

val Icons.Groot: ImageVector
    get() = ImageVector.Builder(
        name = "Groot",
        defaultWidth = 18.0.dp,
        defaultHeight = 24.0.dp,
        viewportWidth = 18.0F,
        viewportHeight = 24.0F,
    ).path(
        fill = SolidColor(Color(0xFFE6E0E9)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.EvenOdd,
    ) {
        moveTo(0.545F, 10.909F)
        lineTo(0.0F, 4.909F)
        lineTo(3.0F, 3.0F)
        lineTo(2.182F, 4.909F)
        lineTo(3.273F, 5.455F)
        lineTo(4.364F, 8.182F)
        verticalLineTo(5.455F)
        lineTo(5.182F, 2.455F)
        horizontalLineTo(6.273F)
        lineTo(7.364F, 1.364F)
        lineTo(8.182F, 4.364F)
        lineTo(9.273F, 5.455F)
        verticalLineTo(3.273F)
        lineTo(9.545F, 0.273F)
        lineTo(10.909F, 1.091F)
        lineTo(11.455F, 0.545F)
        lineTo(13.091F, 1.091F)
        lineTo(12.0F, 3.818F)
        verticalLineTo(7.091F)
        lineTo(13.909F, 3.0F)
        lineTo(15.273F, 0.0F)
        lineTo(16.364F, 0.545F)
        lineTo(16.909F, 2.182F)
        lineTo(18.0F, 3.273F)
        curveTo(18.0F, 3.273F, 17.455F, 8.727F, 17.455F, 12.545F)
        lineTo(15.273F, 20.727F)
        lineTo(11.455F, 24.0F)
        horizontalLineTo(7.636F)
        lineTo(4.364F, 21.818F)
        lineTo(2.182F, 17.455F)
        lineTo(1.636F, 13.091F)
        lineTo(0.545F, 10.909F)

        moveTo(7.406F, 15.6F)
        curveTo(7.539F, 15.342F, 7.614F, 15.05F, 7.614F, 14.741F)
        curveTo(7.614F, 14.41F, 7.528F, 14.1F, 7.378F, 13.83F)
        curveTo(6.944F, 13.449F, 6.365F, 13.091F, 5.727F, 13.091F)
        curveTo(5.111F, 13.091F, 4.55F, 13.425F, 4.121F, 13.792F)
        curveTo(3.957F, 14.07F, 3.863F, 14.394F, 3.863F, 14.741F)
        curveTo(3.863F, 15.065F, 3.946F, 15.371F, 4.091F, 15.637F)
        curveTo(4.524F, 16.014F, 5.096F, 16.364F, 5.727F, 16.364F)
        curveTo(6.379F, 16.364F, 6.968F, 15.99F, 7.406F, 15.6F)

        moveTo(9.545F, 21.818F)
        curveTo(10.901F, 21.818F, 12.0F, 20.719F, 12.0F, 19.364F)
        curveTo(12.0F, 19.091F, 7.091F, 19.091F, 7.091F, 19.364F)
        curveTo(7.091F, 20.719F, 8.19F, 21.818F, 9.545F, 21.818F)

        moveTo(14.454F, 15.637F)
        curveTo(14.6F, 15.371F, 14.682F, 15.066F, 14.682F, 14.741F)
        curveTo(14.682F, 14.394F, 14.588F, 14.07F, 14.425F, 13.792F)
        curveTo(13.995F, 13.425F, 13.434F, 13.091F, 12.818F, 13.091F)
        curveTo(12.18F, 13.091F, 11.602F, 13.449F, 11.167F, 13.83F)
        curveTo(11.017F, 14.1F, 10.932F, 14.41F, 10.932F, 14.741F)
        curveTo(10.932F, 15.05F, 11.007F, 15.342F, 11.139F, 15.6F)
        curveTo(11.577F, 15.99F, 12.167F, 16.364F, 12.818F, 16.364F)
        curveTo(13.449F, 16.364F, 14.021F, 16.014F, 14.454F, 15.637F)
        close()
    }.build()

val Icons.Comic: ImageVector
    get() =  ImageVector.Builder(
        name = "Comic",
        defaultWidth = 18.0.dp,
        defaultHeight = 24.0.dp,
        viewportWidth = 18.0F,
        viewportHeight = 24.0F,
    ).path(
        fill = SolidColor(Color(0xFFE6E0E9)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.EvenOdd,
    ) {
        moveTo(0.0F, 2.75F)
        curveTo(0.0F, 1.231F, 1.231F, 0.0F, 2.75F, 0.0F)
        horizontalLineTo(17.25F)
        curveTo(17.664F, 0.0F, 18.0F, 0.336F, 18.0F, 0.75F)
        verticalLineTo(21.25F)
        curveTo(18.0F, 21.664F, 17.664F, 22.0F, 17.25F, 22.0F)
        horizontalLineTo(11.25F)
        curveTo(10.836F, 22.0F, 10.5F, 21.664F, 10.5F, 21.25F)
        curveTo(10.5F, 20.836F, 10.836F, 20.5F, 11.25F, 20.5F)
        horizontalLineTo(16.5F)
        verticalLineTo(16.5F)
        horizontalLineTo(3.0F)
        curveTo(2.172F, 16.5F, 1.5F, 17.172F, 1.5F, 18.0F)
        verticalLineTo(18.75F)
        curveTo(1.5F, 19.466F, 1.931F, 20.084F, 2.55F, 20.355F)
        curveTo(2.93F, 20.521F, 3.103F, 20.963F, 2.937F, 21.342F)
        curveTo(2.771F, 21.722F, 2.329F, 21.895F, 1.95F, 21.729F)
        curveTo(0.803F, 21.228F, 0.0F, 20.084F, 0.0F, 18.75F)
        verticalLineTo(2.75F)

        moveTo(16.5F, 1.5F)
        verticalLineTo(15.0F)
        horizontalLineTo(3.0F)
        curveTo(2.454F, 15.0F, 1.941F, 15.146F, 1.5F, 15.401F)
        verticalLineTo(2.75F)
        curveTo(1.5F, 2.06F, 2.06F, 1.5F, 2.75F, 1.5F)
        horizontalLineTo(16.5F)
        close()
    }.path(
        fill = SolidColor(Color(0xFFE6E0E9)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(4.0F, 18.25F)
        curveTo(4.0F, 18.112F, 4.112F, 18.0F, 4.25F, 18.0F)
        horizontalLineTo(9.25F)
        curveTo(9.388F, 18.0F, 9.5F, 18.112F, 9.5F, 18.25F)
        verticalLineTo(23.259F)
        curveTo(9.5F, 23.463F, 9.268F, 23.581F, 9.103F, 23.461F)
        lineTo(6.897F, 21.857F)
        curveTo(6.809F, 21.793F, 6.691F, 21.793F, 6.603F, 21.857F)
        lineTo(4.397F, 23.461F)
        curveTo(4.232F, 23.581F, 4.0F, 23.463F, 4.0F, 23.259F)
        verticalLineTo(18.25F)
        close()
    }.build()


val Icons.Heart: ImageVector
    get() = ImageVector.Builder(
        name = "Heart",
        defaultWidth = 22.0.dp,
        defaultHeight = 20.0.dp,
        viewportWidth = 22.0F,
        viewportHeight = 20.0F,
    ).path(
        fill = SolidColor(Color(0xFFE6E0E9)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(13.0F, 18.408F)
        curveTo(12.508F, 18.716F, 12.097F, 18.954F, 11.808F, 19.117F)
        curveTo(11.655F, 19.203F, 11.5F, 19.287F, 11.345F, 19.369F)
        lineTo(11.344F, 19.369F)
        lineTo(11.343F, 19.37F)
        curveTo(11.128F, 19.48F, 10.873F, 19.48F, 10.657F, 19.37F)
        curveTo(10.501F, 19.288F, 10.346F, 19.203F, 10.192F, 19.117F)
        curveTo(9.903F, 18.954F, 9.492F, 18.716F, 9.0F, 18.408F)
        curveTo(8.018F, 17.793F, 6.705F, 16.897F, 5.389F, 15.776F)
        curveTo(2.801F, 13.573F, 0.0F, 10.332F, 0.0F, 6.514F)
        curveTo(0.0F, 3.052F, 2.829F, 0.5F, 5.736F, 0.5F)
        curveTo(8.03F, 0.5F, 9.881F, 1.726F, 11.0F, 3.605F)
        curveTo(12.119F, 1.726F, 13.97F, 0.5F, 16.264F, 0.5F)
        curveTo(19.171F, 0.5F, 22.0F, 3.052F, 22.0F, 6.514F)
        curveTo(22.0F, 10.332F, 19.199F, 13.573F, 16.611F, 15.776F)
        curveTo(15.295F, 16.897F, 13.982F, 17.793F, 13.0F, 18.408F)
        close()
    }.build()

val Icons.Logo: ImageVector
    get() = ImageVector.Builder(
        name = "Logo",
        defaultWidth = 29.0.dp,
        defaultHeight = 17.0.dp,
        viewportWidth = 29.0F,
        viewportHeight = 17.0F,
    ).path(
        fill = SolidColor(Color(0xFFFFFFFF)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(25.15F, 1.944F)
        verticalLineTo(0.001F)
        horizontalLineTo(19.863F)
        lineTo(18.993F, 6.491F)
        lineTo(18.133F, 0.001F)
        horizontalLineTo(16.226F)
        lineTo(16.44F, 1.733F)
        curveTo(16.219F, 1.289F, 15.439F, 0.001F, 13.721F, 0.001F)
        curveTo(13.71F, 0.001F, 11.812F, 0.001F, 11.812F, 0.001F)
        lineTo(11.805F, 9.46F)
        lineTo(10.415F, 0.001F)
        lineTo(7.918F, 0.0F)
        lineTo(6.48F, 9.801F)
        lineTo(6.481F, 0.001F)
        horizontalLineTo(4.091F)
        lineTo(3.23F, 5.506F)
        lineTo(2.391F, 0.001F)
        horizontalLineTo(0.0F)
        verticalLineTo(10.656F)
        horizontalLineTo(1.883F)
        verticalLineTo(5.521F)
        lineTo(2.739F, 10.656F)
        horizontalLineTo(3.74F)
        lineTo(4.584F, 5.521F)
        verticalLineTo(10.656F)
        horizontalLineTo(8.213F)
        lineTo(8.433F, 9.017F)
        horizontalLineTo(9.894F)
        lineTo(10.114F, 10.656F)
        lineTo(13.68F, 10.658F)
        verticalLineTo(10.656F)
        horizontalLineTo(13.684F)
        verticalLineTo(7.198F)
        lineTo(14.121F, 7.133F)
        lineTo(15.025F, 10.658F)
        horizontalLineTo(16.868F)
        lineTo(16.867F, 10.656F)
        horizontalLineTo(16.873F)
        lineTo(15.686F, 6.524F)
        curveTo(16.288F, 6.069F, 16.967F, 4.914F, 16.786F, 3.809F)
        curveTo(16.788F, 3.824F, 17.906F, 10.663F, 17.906F, 10.663F)
        lineTo(20.098F, 10.656F)
        lineTo(21.596F, 0.998F)
        verticalLineTo(10.656F)
        horizontalLineTo(25.15F)
        verticalLineTo(8.74F)
        horizontalLineTo(23.463F)
        verticalLineTo(6.296F)
        horizontalLineTo(25.15F)
        verticalLineTo(4.351F)
        horizontalLineTo(23.463F)
        verticalLineTo(1.944F)
        horizontalLineTo(25.15F)

        moveTo(8.655F, 7.327F)
        lineTo(9.172F, 2.772F)
        lineTo(9.709F, 7.327F)
        horizontalLineTo(8.655F)

        moveTo(14.127F, 5.224F)
        curveTo(13.982F, 5.296F, 13.831F, 5.332F, 13.684F, 5.332F)
        verticalLineTo(1.904F)
        curveTo(13.687F, 1.904F, 13.69F, 1.904F, 13.693F, 1.904F)
        curveTo(13.841F, 1.903F, 14.94F, 1.949F, 14.94F, 3.599F)
        curveTo(14.94F, 4.462F, 14.566F, 5.006F, 14.127F, 5.224F)

        moveTo(28.943F, 8.739F)
        verticalLineTo(10.655F)
        horizontalLineTo(25.476F)
        verticalLineTo(0.0F)
        horizontalLineTo(27.342F)
        verticalLineTo(8.739F)
        horizontalLineTo(28.943F)
        close()
    }.path(
        fill = SolidColor(Color(0xFFFFFFFF)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(5.88F, 16.081F)
        curveTo(5.88F, 16.173F, 5.895F, 16.255F, 5.925F, 16.328F)
        curveTo(5.956F, 16.401F, 5.997F, 16.464F, 6.049F, 16.516F)
        curveTo(6.1F, 16.567F, 6.16F, 16.608F, 6.227F, 16.639F)
        curveTo(6.297F, 16.666F, 6.369F, 16.682F, 6.442F, 16.685F)
        curveTo(6.463F, 16.685F, 6.484F, 16.683F, 6.506F, 16.68F)
        curveTo(6.527F, 16.677F, 6.553F, 16.671F, 6.583F, 16.662F)
        curveTo(6.617F, 16.65F, 6.658F, 16.634F, 6.707F, 16.616F)
        curveTo(6.755F, 16.598F, 6.818F, 16.573F, 6.894F, 16.543F)
        lineTo(7.04F, 16.479F)
        lineTo(7.164F, 16.794F)
        lineTo(6.766F, 16.936F)
        curveTo(6.714F, 16.954F, 6.658F, 16.969F, 6.597F, 16.982F)
        curveTo(6.536F, 16.994F, 6.484F, 17.0F, 6.442F, 17.0F)
        curveTo(6.326F, 17.0F, 6.215F, 16.98F, 6.108F, 16.941F)
        curveTo(6.005F, 16.898F, 5.913F, 16.838F, 5.834F, 16.762F)
        curveTo(5.755F, 16.683F, 5.692F, 16.589F, 5.647F, 16.479F)
        curveTo(5.601F, 16.366F, 5.578F, 16.241F, 5.578F, 16.104F)
        verticalLineTo(14.656F)
        curveTo(5.578F, 14.531F, 5.601F, 14.412F, 5.647F, 14.299F)
        curveTo(5.692F, 14.183F, 5.742F, 14.095F, 5.797F, 14.034F)
        curveTo(5.846F, 13.976F, 5.889F, 13.932F, 5.925F, 13.902F)
        curveTo(5.965F, 13.871F, 6.005F, 13.844F, 6.044F, 13.819F)
        lineTo(6.067F, 13.81F)
        lineTo(6.053F, 13.815F)
        curveTo(6.087F, 13.797F, 6.134F, 13.775F, 6.195F, 13.751F)
        curveTo(6.259F, 13.723F, 6.344F, 13.71F, 6.451F, 13.71F)
        curveTo(6.497F, 13.71F, 6.55F, 13.717F, 6.611F, 13.733F)
        curveTo(6.672F, 13.748F, 6.725F, 13.763F, 6.771F, 13.778F)
        lineTo(7.155F, 13.925F)
        lineTo(7.049F, 14.222F)
        lineTo(6.629F, 14.062F)
        curveTo(6.599F, 14.049F, 6.568F, 14.039F, 6.538F, 14.03F)
        curveTo(6.507F, 14.02F, 6.48F, 14.016F, 6.455F, 14.016F)
        curveTo(6.379F, 14.016F, 6.306F, 14.034F, 6.236F, 14.071F)
        curveTo(6.169F, 14.107F, 6.11F, 14.156F, 6.058F, 14.217F)
        curveTo(6.006F, 14.275F, 5.965F, 14.342F, 5.934F, 14.418F)
        curveTo(5.904F, 14.494F, 5.889F, 14.573F, 5.889F, 14.656F)
        lineTo(5.88F, 16.081F)
        close()
    }.path(
        fill = SolidColor(Color(0xFFFFFFFF)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(8.814F, 16.954F)
        verticalLineTo(15.268F)
        curveTo(8.814F, 15.17F, 8.781F, 15.088F, 8.714F, 15.021F)
        curveTo(8.647F, 14.951F, 8.568F, 14.916F, 8.476F, 14.916F)
        curveTo(8.424F, 14.916F, 8.353F, 14.925F, 8.261F, 14.943F)
        curveTo(8.17F, 14.962F, 8.082F, 15.0F, 7.996F, 15.058F)
        verticalLineTo(16.954F)
        horizontalLineTo(7.708F)
        verticalLineTo(13.778F)
        horizontalLineTo(7.996F)
        verticalLineTo(14.733F)
        curveTo(8.112F, 14.672F, 8.208F, 14.639F, 8.284F, 14.633F)
        curveTo(8.363F, 14.627F, 8.427F, 14.624F, 8.476F, 14.624F)
        curveTo(8.561F, 14.624F, 8.642F, 14.642F, 8.718F, 14.679F)
        curveTo(8.795F, 14.712F, 8.86F, 14.759F, 8.915F, 14.82F)
        curveTo(8.973F, 14.878F, 9.017F, 14.947F, 9.047F, 15.026F)
        curveTo(9.081F, 15.105F, 9.098F, 15.19F, 9.098F, 15.282F)
        verticalLineTo(16.954F)
        horizontalLineTo(8.814F)
        close()
    }.path(
        fill = SolidColor(Color(0xFFFFFFFF)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(10.787F, 15.844F)
        curveTo(10.787F, 15.841F, 10.773F, 15.833F, 10.746F, 15.821F)
        curveTo(10.721F, 15.806F, 10.688F, 15.79F, 10.645F, 15.775F)
        curveTo(10.602F, 15.76F, 10.552F, 15.746F, 10.494F, 15.734F)
        curveTo(10.436F, 15.722F, 10.375F, 15.716F, 10.311F, 15.716F)
        curveTo(10.217F, 15.716F, 10.136F, 15.751F, 10.069F, 15.821F)
        curveTo(10.005F, 15.891F, 9.973F, 15.973F, 9.973F, 16.068F)
        verticalLineTo(16.351F)
        curveTo(9.973F, 16.449F, 10.005F, 16.532F, 10.069F, 16.602F)
        curveTo(10.136F, 16.669F, 10.216F, 16.703F, 10.307F, 16.703F)
        curveTo(10.34F, 16.703F, 10.385F, 16.695F, 10.439F, 16.68F)
        curveTo(10.494F, 16.665F, 10.548F, 16.648F, 10.599F, 16.63F)
        curveTo(10.657F, 16.608F, 10.72F, 16.583F, 10.787F, 16.552F)
        verticalLineTo(15.844F)

        moveTo(11.075F, 16.694F)
        lineTo(11.175F, 16.785F)
        lineTo(10.97F, 16.991F)
        lineTo(10.846F, 16.868F)
        curveTo(10.752F, 16.913F, 10.653F, 16.947F, 10.549F, 16.968F)
        curveTo(10.446F, 16.989F, 10.366F, 17.0F, 10.311F, 17.0F)
        curveTo(10.223F, 17.0F, 10.141F, 16.983F, 10.065F, 16.95F)
        curveTo(9.989F, 16.913F, 9.923F, 16.864F, 9.868F, 16.803F)
        curveTo(9.813F, 16.743F, 9.769F, 16.673F, 9.736F, 16.593F)
        curveTo(9.705F, 16.511F, 9.69F, 16.424F, 9.69F, 16.333F)
        verticalLineTo(16.081F)
        curveTo(9.69F, 15.993F, 9.705F, 15.909F, 9.736F, 15.83F)
        curveTo(9.769F, 15.751F, 9.813F, 15.682F, 9.868F, 15.625F)
        curveTo(9.923F, 15.564F, 9.989F, 15.516F, 10.065F, 15.483F)
        curveTo(10.141F, 15.446F, 10.223F, 15.428F, 10.311F, 15.428F)
        curveTo(10.33F, 15.428F, 10.357F, 15.429F, 10.394F, 15.432F)
        curveTo(10.433F, 15.432F, 10.476F, 15.437F, 10.522F, 15.446F)
        curveTo(10.568F, 15.452F, 10.613F, 15.463F, 10.659F, 15.478F)
        curveTo(10.708F, 15.49F, 10.752F, 15.507F, 10.791F, 15.528F)
        verticalLineTo(15.432F)
        curveTo(10.791F, 15.368F, 10.779F, 15.305F, 10.755F, 15.241F)
        curveTo(10.733F, 15.177F, 10.703F, 15.12F, 10.663F, 15.071F)
        curveTo(10.624F, 15.023F, 10.577F, 14.983F, 10.522F, 14.953F)
        curveTo(10.47F, 14.922F, 10.415F, 14.907F, 10.357F, 14.907F)
        curveTo(10.336F, 14.907F, 10.293F, 14.915F, 10.229F, 14.93F)
        curveTo(10.168F, 14.945F, 10.103F, 14.96F, 10.033F, 14.976F)
        curveTo(9.954F, 14.997F, 9.865F, 15.02F, 9.768F, 15.044F)
        lineTo(9.69F, 14.77F)
        curveTo(9.791F, 14.743F, 9.885F, 14.718F, 9.973F, 14.697F)
        curveTo(10.05F, 14.679F, 10.124F, 14.662F, 10.197F, 14.646F)
        curveTo(10.27F, 14.631F, 10.324F, 14.624F, 10.357F, 14.624F)
        curveTo(10.455F, 14.624F, 10.546F, 14.646F, 10.631F, 14.692F)
        curveTo(10.72F, 14.738F, 10.796F, 14.799F, 10.86F, 14.875F)
        curveTo(10.924F, 14.951F, 10.974F, 15.038F, 11.011F, 15.135F)
        curveTo(11.05F, 15.23F, 11.07F, 15.329F, 11.07F, 15.432F)
        lineTo(11.075F, 16.694F)
        close()
    }.path(
        fill = SolidColor(Color(0xFFFFFFFF)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(12.803F, 15.067F)
        curveTo(12.748F, 15.033F, 12.702F, 15.007F, 12.665F, 14.989F)
        curveTo(12.632F, 14.968F, 12.601F, 14.953F, 12.574F, 14.943F)
        curveTo(12.547F, 14.934F, 12.521F, 14.93F, 12.496F, 14.93F)
        curveTo(12.472F, 14.927F, 12.446F, 14.925F, 12.419F, 14.925F)
        curveTo(12.376F, 14.925F, 12.32F, 14.938F, 12.25F, 14.962F)
        curveTo(12.18F, 14.983F, 12.108F, 15.026F, 12.035F, 15.09F)
        verticalLineTo(16.95F)
        horizontalLineTo(11.752F)
        verticalLineTo(14.966F)
        curveTo(11.733F, 14.948F, 11.71F, 14.927F, 11.683F, 14.902F)
        curveTo(11.656F, 14.878F, 11.634F, 14.857F, 11.619F, 14.838F)
        lineTo(11.82F, 14.633F)
        lineTo(11.975F, 14.784F)
        curveTo(12.064F, 14.714F, 12.146F, 14.669F, 12.222F, 14.651F)
        curveTo(12.301F, 14.633F, 12.37F, 14.624F, 12.428F, 14.624F)
        curveTo(12.489F, 14.624F, 12.557F, 14.637F, 12.634F, 14.665F)
        curveTo(12.71F, 14.692F, 12.819F, 14.745F, 12.962F, 14.825F)
        lineTo(12.803F, 15.067F)
        close()
    }.path(
        fill = SolidColor(Color(0xFFFFFFFF)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(14.401F, 15.844F)
        curveTo(14.401F, 15.841F, 14.387F, 15.833F, 14.36F, 15.821F)
        curveTo(14.336F, 15.806F, 14.302F, 15.79F, 14.259F, 15.775F)
        curveTo(14.217F, 15.76F, 14.167F, 15.746F, 14.109F, 15.734F)
        curveTo(14.051F, 15.722F, 13.99F, 15.716F, 13.926F, 15.716F)
        curveTo(13.832F, 15.716F, 13.751F, 15.751F, 13.684F, 15.821F)
        curveTo(13.62F, 15.891F, 13.588F, 15.973F, 13.588F, 16.068F)
        verticalLineTo(16.351F)
        curveTo(13.588F, 16.449F, 13.62F, 16.532F, 13.684F, 16.602F)
        curveTo(13.751F, 16.669F, 13.83F, 16.703F, 13.921F, 16.703F)
        curveTo(13.955F, 16.703F, 13.999F, 16.695F, 14.054F, 16.68F)
        curveTo(14.109F, 16.665F, 14.162F, 16.648F, 14.214F, 16.63F)
        curveTo(14.272F, 16.608F, 14.334F, 16.583F, 14.401F, 16.552F)
        verticalLineTo(15.844F)

        moveTo(14.689F, 16.694F)
        lineTo(14.79F, 16.785F)
        lineTo(14.584F, 16.991F)
        lineTo(14.461F, 16.868F)
        curveTo(14.366F, 16.913F, 14.267F, 16.947F, 14.163F, 16.968F)
        curveTo(14.06F, 16.989F, 13.981F, 17.0F, 13.926F, 17.0F)
        curveTo(13.838F, 17.0F, 13.755F, 16.983F, 13.679F, 16.95F)
        curveTo(13.603F, 16.913F, 13.538F, 16.864F, 13.483F, 16.803F)
        curveTo(13.428F, 16.743F, 13.384F, 16.673F, 13.35F, 16.593F)
        curveTo(13.32F, 16.511F, 13.304F, 16.424F, 13.304F, 16.333F)
        verticalLineTo(16.081F)
        curveTo(13.304F, 15.993F, 13.32F, 15.909F, 13.35F, 15.83F)
        curveTo(13.384F, 15.751F, 13.428F, 15.682F, 13.483F, 15.625F)
        curveTo(13.538F, 15.564F, 13.603F, 15.516F, 13.679F, 15.483F)
        curveTo(13.755F, 15.446F, 13.838F, 15.428F, 13.926F, 15.428F)
        curveTo(13.944F, 15.428F, 13.972F, 15.429F, 14.008F, 15.432F)
        curveTo(14.048F, 15.432F, 14.09F, 15.437F, 14.136F, 15.446F)
        curveTo(14.182F, 15.452F, 14.227F, 15.463F, 14.273F, 15.478F)
        curveTo(14.322F, 15.49F, 14.366F, 15.507F, 14.406F, 15.528F)
        verticalLineTo(15.432F)
        curveTo(14.406F, 15.368F, 14.394F, 15.305F, 14.369F, 15.241F)
        curveTo(14.348F, 15.177F, 14.317F, 15.12F, 14.278F, 15.071F)
        curveTo(14.238F, 15.023F, 14.191F, 14.983F, 14.136F, 14.953F)
        curveTo(14.084F, 14.922F, 14.03F, 14.907F, 13.972F, 14.907F)
        curveTo(13.95F, 14.907F, 13.908F, 14.915F, 13.844F, 14.93F)
        curveTo(13.783F, 14.945F, 13.717F, 14.96F, 13.647F, 14.976F)
        curveTo(13.568F, 14.997F, 13.48F, 15.02F, 13.382F, 15.044F)
        lineTo(13.304F, 14.77F)
        curveTo(13.405F, 14.743F, 13.499F, 14.718F, 13.588F, 14.697F)
        curveTo(13.664F, 14.679F, 13.738F, 14.662F, 13.812F, 14.646F)
        curveTo(13.885F, 14.631F, 13.938F, 14.624F, 13.972F, 14.624F)
        curveTo(14.069F, 14.624F, 14.16F, 14.646F, 14.246F, 14.692F)
        curveTo(14.334F, 14.738F, 14.41F, 14.799F, 14.474F, 14.875F)
        curveTo(14.538F, 14.951F, 14.589F, 15.038F, 14.625F, 15.135F)
        curveTo(14.665F, 15.23F, 14.684F, 15.329F, 14.684F, 15.432F)
        lineTo(14.689F, 16.694F)
        close()
    }.path(
        fill = SolidColor(Color(0xFFFFFFFF)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(15.594F, 16.264F)
        curveTo(15.594F, 16.401F, 15.639F, 16.51F, 15.727F, 16.589F)
        curveTo(15.818F, 16.668F, 15.925F, 16.708F, 16.047F, 16.708F)
        curveTo(16.071F, 16.708F, 16.106F, 16.705F, 16.152F, 16.698F)
        curveTo(16.201F, 16.689F, 16.248F, 16.679F, 16.294F, 16.666F)
        curveTo(16.348F, 16.654F, 16.405F, 16.639F, 16.463F, 16.621F)
        lineTo(16.549F, 16.886F)
        curveTo(16.486F, 16.907F, 16.425F, 16.925F, 16.367F, 16.941F)
        curveTo(16.315F, 16.956F, 16.26F, 16.968F, 16.202F, 16.977F)
        curveTo(16.144F, 16.986F, 16.093F, 16.991F, 16.047F, 16.991F)
        curveTo(15.946F, 16.991F, 15.85F, 16.973F, 15.759F, 16.936F)
        curveTo(15.67F, 16.899F, 15.593F, 16.849F, 15.526F, 16.785F)
        curveTo(15.459F, 16.721F, 15.406F, 16.645F, 15.366F, 16.557F)
        curveTo(15.329F, 16.468F, 15.311F, 16.371F, 15.311F, 16.264F)
        verticalLineTo(15.337F)
        curveTo(15.311F, 15.233F, 15.329F, 15.137F, 15.366F, 15.049F)
        curveTo(15.406F, 14.96F, 15.457F, 14.884F, 15.521F, 14.82F)
        curveTo(15.588F, 14.756F, 15.666F, 14.707F, 15.754F, 14.674F)
        curveTo(15.846F, 14.637F, 15.942F, 14.619F, 16.042F, 14.619F)
        curveTo(16.091F, 14.619F, 16.143F, 14.627F, 16.198F, 14.642F)
        curveTo(16.252F, 14.654F, 16.306F, 14.668F, 16.358F, 14.683F)
        curveTo(16.412F, 14.701F, 16.47F, 14.723F, 16.531F, 14.747F)
        lineTo(16.458F, 14.998F)
        curveTo(16.409F, 14.98F, 16.359F, 14.965F, 16.307F, 14.953F)
        curveTo(16.265F, 14.941F, 16.219F, 14.93F, 16.17F, 14.921F)
        curveTo(16.121F, 14.908F, 16.079F, 14.902F, 16.042F, 14.902F)
        curveTo(15.92F, 14.902F, 15.815F, 14.942F, 15.727F, 15.021F)
        curveTo(15.639F, 15.1F, 15.594F, 15.206F, 15.594F, 15.337F)
        verticalLineTo(16.264F)
        close()
    }.path(
        fill = SolidColor(Color(0xFFFFFFFF)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(17.255F, 14.948F)
        horizontalLineTo(16.876F)
        verticalLineTo(14.665F)
        horizontalLineTo(17.255F)
        verticalLineTo(13.778F)
        horizontalLineTo(17.552F)
        verticalLineTo(14.665F)
        horizontalLineTo(17.959F)
        verticalLineTo(14.948F)
        horizontalLineTo(17.552F)
        verticalLineTo(16.369F)
        curveTo(17.552F, 16.479F, 17.58F, 16.555F, 17.634F, 16.598F)
        curveTo(17.689F, 16.638F, 17.755F, 16.657F, 17.831F, 16.657F)
        horizontalLineTo(17.959F)
        verticalLineTo(16.959F)
        horizontalLineTo(17.808F)
        curveTo(17.653F, 16.959F, 17.522F, 16.912F, 17.415F, 16.817F)
        curveTo(17.308F, 16.72F, 17.255F, 16.563F, 17.255F, 16.347F)
        verticalLineTo(14.948F)
        close()
    }.path(
        fill = SolidColor(Color(0xFFFFFFFF)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(19.221F, 15.821F)
        curveTo(19.315F, 15.821F, 19.395F, 15.784F, 19.458F, 15.711F)
        curveTo(19.525F, 15.635F, 19.559F, 15.548F, 19.559F, 15.451F)
        verticalLineTo(15.263F)
        curveTo(19.559F, 15.2F, 19.547F, 15.146F, 19.522F, 15.104F)
        curveTo(19.498F, 15.058F, 19.465F, 15.021F, 19.422F, 14.994F)
        curveTo(19.382F, 14.966F, 19.335F, 14.947F, 19.28F, 14.934F)
        curveTo(19.225F, 14.922F, 19.169F, 14.916F, 19.111F, 14.916F)
        curveTo(19.008F, 14.916F, 18.916F, 14.948F, 18.837F, 15.012F)
        curveTo(18.758F, 15.073F, 18.718F, 15.157F, 18.718F, 15.263F)
        verticalLineTo(15.816F)
        lineTo(19.221F, 15.821F)

        moveTo(18.421F, 15.286F)
        curveTo(18.421F, 15.195F, 18.438F, 15.11F, 18.471F, 15.03F)
        curveTo(18.505F, 14.948F, 18.551F, 14.878F, 18.608F, 14.82F)
        curveTo(18.666F, 14.759F, 18.733F, 14.712F, 18.809F, 14.679F)
        curveTo(18.889F, 14.642F, 18.972F, 14.624F, 19.061F, 14.624F)
        horizontalLineTo(19.212F)
        curveTo(19.3F, 14.624F, 19.382F, 14.64F, 19.458F, 14.674F)
        curveTo(19.538F, 14.707F, 19.606F, 14.755F, 19.664F, 14.816F)
        curveTo(19.722F, 14.873F, 19.768F, 14.943F, 19.801F, 15.026F)
        curveTo(19.835F, 15.105F, 19.851F, 15.192F, 19.851F, 15.286F)
        verticalLineTo(15.432F)
        curveTo(19.851F, 15.564F, 19.829F, 15.673F, 19.783F, 15.762F)
        curveTo(19.737F, 15.85F, 19.673F, 15.922F, 19.591F, 15.976F)
        curveTo(19.512F, 16.031F, 19.419F, 16.071F, 19.312F, 16.095F)
        curveTo(19.206F, 16.119F, 19.093F, 16.132F, 18.974F, 16.132F)
        curveTo(18.889F, 16.132F, 18.803F, 16.127F, 18.718F, 16.118F)
        verticalLineTo(16.347F)
        curveTo(18.74F, 16.453F, 18.791F, 16.54F, 18.874F, 16.607F)
        curveTo(18.959F, 16.674F, 19.055F, 16.708F, 19.161F, 16.708F)
        curveTo(19.167F, 16.708F, 19.202F, 16.701F, 19.267F, 16.689F)
        curveTo(19.333F, 16.674F, 19.405F, 16.657F, 19.481F, 16.639F)
        curveTo(19.57F, 16.621F, 19.667F, 16.598F, 19.774F, 16.57F)
        lineTo(19.847F, 16.872F)
        curveTo(19.731F, 16.896F, 19.625F, 16.918F, 19.527F, 16.936F)
        curveTo(19.445F, 16.951F, 19.367F, 16.965F, 19.294F, 16.977F)
        curveTo(19.221F, 16.989F, 19.177F, 16.995F, 19.161F, 16.995F)
        curveTo(19.061F, 16.995F, 18.965F, 16.977F, 18.874F, 16.941F)
        curveTo(18.785F, 16.904F, 18.708F, 16.854F, 18.64F, 16.79F)
        curveTo(18.573F, 16.726F, 18.52F, 16.65F, 18.48F, 16.561F)
        curveTo(18.441F, 16.473F, 18.421F, 16.375F, 18.421F, 16.269F)
        verticalLineTo(15.286F)
        close()
    }.path(
        fill = SolidColor(Color(0xFFFFFFFF)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(21.519F, 15.067F)
        curveTo(21.465F, 15.033F, 21.419F, 15.007F, 21.382F, 14.989F)
        curveTo(21.349F, 14.968F, 21.318F, 14.953F, 21.291F, 14.943F)
        curveTo(21.264F, 14.934F, 21.238F, 14.93F, 21.213F, 14.93F)
        curveTo(21.189F, 14.927F, 21.163F, 14.925F, 21.135F, 14.925F)
        curveTo(21.093F, 14.925F, 21.037F, 14.938F, 20.966F, 14.962F)
        curveTo(20.896F, 14.983F, 20.825F, 15.026F, 20.752F, 15.09F)
        verticalLineTo(16.95F)
        horizontalLineTo(20.468F)
        verticalLineTo(14.966F)
        curveTo(20.45F, 14.948F, 20.427F, 14.927F, 20.4F, 14.902F)
        curveTo(20.372F, 14.878F, 20.351F, 14.857F, 20.336F, 14.838F)
        lineTo(20.537F, 14.633F)
        lineTo(20.692F, 14.784F)
        curveTo(20.781F, 14.714F, 20.863F, 14.669F, 20.939F, 14.651F)
        curveTo(21.018F, 14.633F, 21.087F, 14.624F, 21.145F, 14.624F)
        curveTo(21.206F, 14.624F, 21.274F, 14.637F, 21.35F, 14.665F)
        curveTo(21.427F, 14.692F, 21.536F, 14.745F, 21.679F, 14.825F)
        lineTo(21.519F, 15.067F)
        close()
    }.path(
        fill = SolidColor(Color(0xFFFFFFFF)),
        fillAlpha = 1.0F,
        strokeAlpha = 1.0F,
        strokeLineWidth = 0.0F,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
        strokeLineMiter = 4.0F,
        pathFillType = PathFillType.NonZero,
    ) {
        moveTo(23.365F, 16.31F)
        curveTo(23.365F, 16.538F, 23.307F, 16.711F, 23.191F, 16.826F)
        curveTo(23.078F, 16.942F, 22.931F, 17.0F, 22.748F, 17.0F)
        curveTo(22.693F, 17.0F, 22.637F, 16.994F, 22.579F, 16.982F)
        curveTo(22.521F, 16.973F, 22.461F, 16.956F, 22.4F, 16.931F)
        lineTo(22.007F, 16.776F)
        lineTo(22.117F, 16.525F)
        lineTo(22.515F, 16.685F)
        curveTo(22.554F, 16.7F, 22.594F, 16.711F, 22.634F, 16.717F)
        curveTo(22.676F, 16.723F, 22.716F, 16.726F, 22.752F, 16.726F)
        curveTo(22.847F, 16.726F, 22.926F, 16.689F, 22.99F, 16.616F)
        curveTo(23.057F, 16.54F, 23.091F, 16.432F, 23.091F, 16.292F)
        curveTo(23.091F, 16.234F, 23.078F, 16.185F, 23.054F, 16.145F)
        curveTo(23.033F, 16.103F, 23.004F, 16.069F, 22.967F, 16.045F)
        curveTo(22.934F, 16.021F, 22.896F, 16.002F, 22.853F, 15.99F)
        curveTo(22.813F, 15.978F, 22.775F, 15.972F, 22.739F, 15.972F)
        curveTo(22.629F, 15.972F, 22.528F, 15.961F, 22.437F, 15.94F)
        curveTo(22.349F, 15.918F, 22.273F, 15.883F, 22.209F, 15.835F)
        curveTo(22.145F, 15.783F, 22.096F, 15.716F, 22.062F, 15.634F)
        curveTo(22.029F, 15.548F, 22.012F, 15.442F, 22.012F, 15.314F)
        curveTo(22.012F, 15.201F, 22.029F, 15.102F, 22.062F, 15.017F)
        curveTo(22.096F, 14.928F, 22.14F, 14.855F, 22.195F, 14.797F)
        curveTo(22.253F, 14.739F, 22.32F, 14.697F, 22.396F, 14.669F)
        curveTo(22.475F, 14.639F, 22.56F, 14.624F, 22.652F, 14.624F)
        curveTo(22.707F, 14.624F, 22.761F, 14.631F, 22.816F, 14.646F)
        curveTo(22.871F, 14.659F, 22.929F, 14.675F, 22.99F, 14.697F)
        lineTo(23.168F, 14.761F)
        lineTo(23.054F, 15.012F)
        curveTo(22.975F, 14.985F, 22.912F, 14.963F, 22.867F, 14.948F)
        curveTo(22.824F, 14.933F, 22.789F, 14.922F, 22.761F, 14.916F)
        curveTo(22.737F, 14.91F, 22.719F, 14.907F, 22.707F, 14.907F)
        curveTo(22.694F, 14.904F, 22.682F, 14.902F, 22.67F, 14.902F)
        horizontalLineTo(22.647F)
        curveTo(22.553F, 14.902F, 22.469F, 14.941F, 22.396F, 15.017F)
        curveTo(22.323F, 15.093F, 22.286F, 15.2F, 22.286F, 15.337F)
        curveTo(22.286F, 15.394F, 22.298F, 15.446F, 22.323F, 15.492F)
        curveTo(22.35F, 15.535F, 22.382F, 15.571F, 22.419F, 15.602F)
        curveTo(22.455F, 15.632F, 22.495F, 15.655F, 22.538F, 15.67F)
        curveTo(22.583F, 15.685F, 22.624F, 15.693F, 22.661F, 15.693F)
        curveTo(22.758F, 15.693F, 22.85F, 15.702F, 22.935F, 15.72F)
        curveTo(23.021F, 15.736F, 23.095F, 15.766F, 23.159F, 15.812F)
        curveTo(23.223F, 15.858F, 23.273F, 15.92F, 23.31F, 15.999F)
        curveTo(23.347F, 16.078F, 23.365F, 16.182F, 23.365F, 16.31F)
        close()
    }.build()
