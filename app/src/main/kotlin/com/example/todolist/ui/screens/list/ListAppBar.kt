package com.example.todolist.ui.screens.list

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import com.example.todolist.ui.theme.topAppBarBackgroundColor
import com.example.todolist.ui.theme.topAppBarContentColor

@Composable
fun listAppBar() {
    defaultListAppBar()
}

@Composable
fun defaultListAppBar() {
    TopAppBar(
        title = {
            Text(
                text = "Tasks",
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor,

        )
}
