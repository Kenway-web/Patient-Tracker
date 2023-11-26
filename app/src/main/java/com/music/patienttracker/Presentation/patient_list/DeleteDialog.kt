package com.music.patienttracker.Presentation.patient_list

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable


@Composable
fun DeleteDialog(
    title:String,
    message:String,
    onDialogDismiss:()->Unit,
    onConfirmationButtonClicked:()->Unit
) {

    AlertDialog(

        title = {
                Text(
                    text = title,
                    style = MaterialTheme.typography.headlineLarge
                )
        },
        text = {
            Text(
                text = message,
                style = MaterialTheme.typography.bodySmall
            )
        },
        confirmButton = {
             TextButton(onClick = { onConfirmationButtonClicked()}) {
                Text(text = "Yes")
            }
        },
        dismissButton = {
                    TextButton(onClick = { onDialogDismiss()}) {
                        Text(text = "No")
                    }
        },
        onDismissRequest = {onDialogDismiss()}
    )

}