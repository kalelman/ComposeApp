package com.example.bullseye

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

@Composable
fun ResultDialog(
    modifier: Modifier = Modifier,
    sliderValue: Int,
    onConfirm: () -> Unit,
    onDismiss: () -> Unit
) {
    BasicAlertDialog(
        modifier = modifier,
        title = stringResource(id = R.string.result_dialog_title),
        message = stringResource(id = R.string.result_dialog_message, sliderValue),
        confirmButtonText = stringResource(id = R.string.result_dialog_button_text),
        onConfirm = onConfirm,
        onDismiss = onDismiss
    )
}