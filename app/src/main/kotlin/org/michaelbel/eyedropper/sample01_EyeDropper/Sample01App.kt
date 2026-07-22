package org.michaelbel.eyedropper.sample01_EyeDropper

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.michaelbel.eyedropper.rememberEyeDropperHandler
import org.michaelbel.eyedropper.ui.EyeDropperIcon

@Composable
fun Sample01App() {
    val openEyeDropper = rememberEyeDropperHandler()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "EyeDropper") },
                actions = {
                    IconButton(onClick = openEyeDropper) {
                        Icon(
                            imageVector = EyeDropperIcon,
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(
                    Brush.linearGradient(
                        colors = listOf(Color(0xFFE91E63), Color(0xFF3F51B5), Color(0xFF4CAF50))
                    )
                )
        )
    }
}
