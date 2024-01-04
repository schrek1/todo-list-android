package com.example.todolist.model.repository

import com.example.todolist.model.db.dao.ToDoTaskDao
import com.example.todolist.model.enitity.ToDoTaskEntity
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ToDoTaskRepository @Inject constructor(
    private val toDoTaskDao: ToDoTaskDao
) {
    val getAllTasks: Flow<List<ToDoTaskEntity>> = toDoTaskDao.getAllTasks()
    val sortByLowPriority: Flow<List<ToDoTaskEntity>> = toDoTaskDao.getByLowPriority()
    val sortByHighPriority: Flow<List<ToDoTaskEntity>> = toDoTaskDao.getByHighPriority()

    fun getSelectedTask(taskId: Long): Flow<ToDoTaskEntity> {
        return toDoTaskDao.getTask(taskId)
    }

    suspend fun addTask(toDoTaskEntity: ToDoTaskEntity) {
        toDoTaskDao.save(toDoTaskEntity)
    }

    suspend fun updateTask(toDoTaskEntity: ToDoTaskEntity) {
        toDoTaskDao.update(toDoTaskEntity)
    }

    suspend fun deleteTask(toDoTaskEntity: ToDoTaskEntity) {
        toDoTaskDao.delete(toDoTaskEntity)
    }

    suspend fun deleteAllTasks() {
        toDoTaskDao.deleteAllTasks()
    }

    fun fullTextSearch(searchQuery: String): Flow<List<ToDoTaskEntity>> {
        return toDoTaskDao.fullTextSearch(searchQuery)
    }
}
