package com.example.todolist.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.todolist.enums.TaskListAction
import com.example.todolist.navigation.Screen

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (TaskListAction) -> Unit
) {
    composable(
        route = Screen.TASK.route,
        arguments = listOf(navArgument(Screen.TASK.Args.TASK_ID) {
            type = NavType.IntType
        })
    ) {

    }
}
