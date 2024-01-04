package com.example.todolist.model.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todolist.model.db.dao.ToDoTaskDao
import com.example.todolist.model.enitity.ToDoTaskEntity

@Database(
    entities = [
        ToDoTaskEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class ToDoAppDatabase : RoomDatabase() {

    abstract fun toDoTaskDao(): ToDoTaskDao

    companion object {
        const val DATABASE_NANE = "ToDoAppDatabase"
    }
}
