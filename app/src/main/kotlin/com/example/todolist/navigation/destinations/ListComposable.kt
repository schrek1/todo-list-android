package com.example.todolist.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.todolist.navigation.Screen
import com.example.todolist.ui.screens.list.listScreen

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (Int) -> Unit
) {
    composable(
        route = Screen.LIST.route,
        arguments = listOf(navArgument(Screen.LIST.Args.ACTION) {
            type = NavType.StringType
        })
    ) {
        listScreen(navigateToTaskScreen)
    }
}
