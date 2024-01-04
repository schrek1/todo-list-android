package com.example.todolist.navigation

import com.example.todolist.enums.TaskListAction
import com.example.todolist.navigation.Screen.TASK.Args.TASK_ID

object Screen {

    object LIST {
        object Args {
            const val ACTION = "action"
        }

        const val route = "list/{${Args.ACTION}}"

        fun composePath(action: TaskListAction) =
            route.replace(Args.ACTION, action.name)
    }

    object TASK {
        object Args {
            const val TASK_ID = "taskId"
        }

        const val route = "task/{$TASK_ID}"

        fun composePath(taskId: Int) =
            route.replace(TASK_ID, taskId.toString())
    }


}
