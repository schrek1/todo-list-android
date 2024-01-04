package com.example.todolist.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.todolist.navigation.destinations.listComposable
import com.example.todolist.navigation.destinations.taskComposable

@Composable
fun setupNavigation(
    navController: NavHostController
) {
    val screenDirector = remember(navController) {
        ScreenDirector(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = Screen.LIST.route,
    ) {
        listComposable(
            navigateToTaskScreen = screenDirector.task
        )
        taskComposable(
            navigateToListScreen = screenDirector.list
        )
    }
}
