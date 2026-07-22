package org.michaelbel.eyedropper

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.plus
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedListItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import org.michaelbel.eyedropper.sample01_EyeDropper.Sample01App
import org.michaelbel.eyedropper.sample02_FlagSecure.Sample02App

private enum class Screen { Home, Sample01, Sample02 }

@Composable
fun MainActivityContent() {
    var screen by remember { mutableStateOf(Screen.Home) }

    BackHandler(enabled = screen != Screen.Home) {
        screen = Screen.Home
    }

    when (screen) {
        Screen.Home -> {
            HomeScreen(
                onOpenSample01 = { screen = Screen.Sample01 },
                onOpenSample02 = { screen = Screen.Sample02 }
            )
        }
        Screen.Sample01 -> Sample01App()
        Screen.Sample02 -> Sample02App()
    }
}

@Composable
private fun HomeScreen(
    onOpenSample01: () -> Unit,
    onOpenSample02: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(R.string.app_name)) }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = innerPadding + PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(ListItemDefaults.SegmentedGap)
        ) {
            item {
                SegmentedListItem(
                    onClick = onOpenSample01,
                    shapes = ListItemDefaults.segmentedShapes(index = 0, count = 2),
                    supportingContent = { Text(text = "Pick a color from anywhere on the screen") },
                    colors = ListItemDefaults.segmentedColors(
                        containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                    ),
                    content = { Text(text = "Open EyeDropper") }
                )
            }
            item {
                SegmentedListItem(
                    onClick = onOpenSample02,
                    shapes = ListItemDefaults.segmentedShapes(index = 1, count = 2),
                    supportingContent = { Text(text = "See how protected content is picked as black") },
                    colors = ListItemDefaults.segmentedColors(
                        containerColor = MaterialTheme.colorScheme.surfaceContainerHighest
                    ),
                    content = { Text(text = "Protected content") }
                )
            }
        }
    }
}
