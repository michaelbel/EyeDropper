package org.michaelbel.eyedropper.ui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _eyeDropperIcon: ImageVector? = null

val EyeDropperIcon: ImageVector
    get() {
        _eyeDropperIcon?.let { return it }
        val icon = ImageVector.Builder(
            name = "EyeDropper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).group(translationY = 960f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(644f, -613f)
                lineToRelative(100f, -94f)
                lineToRelative(-37f, -37f)
                lineToRelative(-96f, 96f)
                lineToRelative(33f, 35f)
                close()

                moveToRelative(0f, 0f)
                lineToRelative(-33f, -35f)
                lineToRelative(33f, 35f)
                close()

                moveTo(120f, -120f)
                verticalLineToRelative(-190f)
                lineToRelative(357f, -357f)
                lineToRelative(-57f, -57f)
                lineToRelative(57f, -56f)
                lineToRelative(77f, 76f)
                lineToRelative(124f, -124f)
                quadToRelative(5f, -5f, 12.5f, -8f)
                reflectiveQuadToRelative(15.5f, -3f)
                quadToRelative(8f, 0f, 15f, 3f)
                reflectiveQuadToRelative(13f, 8f)
                lineToRelative(94f, 94f)
                quadToRelative(5f, 6f, 8f, 13f)
                reflectiveQuadToRelative(3f, 15f)
                quadToRelative(0f, 8f, -3f, 15.5f)
                reflectiveQuadToRelative(-8f, 12.5f)
                lineTo(704f, -554f)
                lineToRelative(56f, 58f)
                lineToRelative(-56f, 56f)
                lineToRelative(-170f, -170f)
                lineToRelative(-334f, 333f)
                verticalLineToRelative(77f)
                horizontalLineToRelative(42f)
                quadToRelative(10f, 22f, 21.5f, 42f)
                reflectiveQuadToRelative(24.5f, 38f)
                horizontalLineTo(120f)
                close()

                moveToRelative(480f, 80f)
                quadToRelative(-91f, 0f, -168f, -48f)
                reflectiveQuadTo(320f, -220f)
                quadToRelative(35f, -84f, 112f, -132f)
                reflectiveQuadToRelative(168f, -48f)
                quadToRelative(91f, 0f, 168f, 48f)
                reflectiveQuadToRelative(112f, 132f)
                quadToRelative(-35f, 84f, -112f, 132f)
                reflectiveQuadTo(600f, -40f)
                close()

                moveToRelative(107.5f, -106f)
                quadToRelative(50.5f, -26f, 82.5f, -74f)
                quadToRelative(-32f, -48f, -82.5f, -74f)
                reflectiveQuadTo(600f, -320f)
                quadToRelative(-57f, 0f, -107.5f, 26f)
                reflectiveQuadTo(410f, -220f)
                quadToRelative(32f, 48f, 82.5f, 74f)
                reflectiveQuadTo(600f, -120f)
                quadToRelative(57f, 0f, 107.5f, -26f)
                close()

                moveToRelative(-150f, -31.5f)
                quadTo(540f, -195f, 540f, -220f)
                reflectiveQuadToRelative(17.5f, -42.5f)
                quadTo(575f, -280f, 600f, -280f)
                reflectiveQuadToRelative(42.5f, 17.5f)
                quadTo(660f, -245f, 660f, -220f)
                reflectiveQuadToRelative(-17.5f, 42.5f)
                quadTo(625f, -160f, 600f, -160f)
                reflectiveQuadToRelative(-42.5f, -17.5f)
                close()
            }
        }.build()
        _eyeDropperIcon = icon
        return icon
    }
