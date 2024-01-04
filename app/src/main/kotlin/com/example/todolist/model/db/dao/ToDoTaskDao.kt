package com.example.todolist.model.db.dao

import androidx.room.*
import com.example.todolist.model.enitity.ToDoTaskEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ToDoTaskDao {

    @Query("SELECT * FROM todo_task ORDER BY id ASC")
    fun getAllTasks(): Flow<List<ToDoTaskEntity>>

    @Query("SELECT * FROM todo_task WHERE id = :taskId")
    fun getTask(taskId: Long): Flow<ToDoTaskEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun save(task: ToDoTaskEntity)

    @Update
    suspend fun update(task: ToDoTaskEntity)

    @Delete
    suspend fun delete(task: ToDoTaskEntity)

    @Query("DELETE FROM todo_task")
    suspend fun deleteAllTasks()

    @Query("SELECT * FROM todo_task WHERE title LIKE :searchQuery OR description LIKE :searchQuery")
    fun fullTextSearch(searchQuery: String): Flow<List<ToDoTaskEntity>>

    @Query(
        """
        SELECT * FROM todo_task 
        ORDER BY CASE 
        WHEN priority LIKE 'L%' THEN 1
        WHEN priority LIKE 'M%' THEN 2 
        WHEN priority LIKE 'H%' THEN 3 
        END
    """
    )
    fun getByLowPriority(): Flow<List<ToDoTaskEntity>>

    @Query(
        """
        SELECT * FROM todo_task 
        ORDER BY CASE 
        WHEN priority LIKE 'L%' THEN 3
        WHEN priority LIKE 'M%' THEN 2 
        WHEN priority LIKE 'H%' THEN 1 
        END
    """
    )
    fun getByHighPriority(): Flow<List<ToDoTaskEntity>>
}
