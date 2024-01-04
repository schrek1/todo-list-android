package com.example.todolist.model.enitity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.todolist.enums.ToDoTaskPriority

@Entity(tableName = "todo_task")
data class ToDoTaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val title: String,
    val description: String,
    val priority: ToDoTaskPriority
)
