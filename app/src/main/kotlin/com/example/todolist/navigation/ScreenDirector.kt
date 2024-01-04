package com.example.todolist.navigation

import androidx.navigation.NavHostController
import com.example.todolist.enums.TaskListAction

class ScreenDirector(navController: NavHostController) {
    val list: (TaskListAction) -> Unit = { action ->
        navController.navigate(Screen.LIST.composePath(action)) {
            popUpTo(Screen.LIST.route) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate(Screen.TASK.composePath(taskId))
    }
}
