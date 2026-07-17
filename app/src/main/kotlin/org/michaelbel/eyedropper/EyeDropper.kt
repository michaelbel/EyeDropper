package org.michaelbel.eyedropper

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import java.util.Locale

@Composable
fun rememberEyeDropperHandler(): () -> Unit {
    val context = LocalContext.current
    val intent = remember { Intent("android.intent.action.OPEN_EYE_DROPPER") }
    val resultContract = rememberLauncherForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK && result.data?.hasExtra("android.intent.extra.COLOR") == true) {
            val color = result.data?.getIntExtra("android.intent.extra.COLOR", Color.BLACK) ?: Color.BLACK
            val hex = String.format(Locale.US, "#%06X", 0xFFFFFF and color)
            Toast.makeText(context, hex, Toast.LENGTH_SHORT).show()
        }
    }
    return remember(resultContract, intent) { { resultContract.launch(intent) } }
}
