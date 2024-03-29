package com.example.todolist.ui.screens.list

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.todolist.R

@Composable
fun listScreen(
    navigateToTaskScreen: (Int) -> Unit
) {
    Scaffold(
        topBar = {
            listAppBar()
        },
        floatingActionButton = {
            fab(onFabClicked = navigateToTaskScreen)
        }
    ) {

    }
}

@Composable
fun fab(
    onFabClicked: (Int) -> Unit
) {
    FloatingActionButton(onClick = {
        onFabClicked(-1)
    }) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = stringResource(
                R.string.add_button
            ),
            tint = Color.White
        )
    }
}

@Composable
@Preview
private fun listScreenPreview() {
    listScreen(
        navigateToTaskScreen = {}
    )
}
