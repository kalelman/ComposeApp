package com.example.bullseye

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BasicAlertDialog(
    modifier: Modifier = Modifier,
    title: String,
    message: String,
    confirmButtonText: String,
    onConfirm: () -> Unit,
    onDismiss: () -> Unit
) {
    AlertDialog(
        modifier = modifier,
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(onClick = onConfirm) {
                Text(text = confirmButtonText)
            }
        },
        title = { Text(text = title) },
        text = { Text(text = message) }
    )
}