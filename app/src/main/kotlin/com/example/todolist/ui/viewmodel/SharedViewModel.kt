package com.example.todolist.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todolist.model.enitity.ToDoTaskEntity
import com.example.todolist.model.repository.ToDoTaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(
    private val toDoTaskRepository: ToDoTaskRepository
) : ViewModel() {

    private val _allTasks = MutableStateFlow<List<ToDoTaskEntity>>(emptyList())

    val allTasks: StateFlow<List<ToDoTaskEntity>> = _allTasks

    fun getAllTasks() {
        viewModelScope.launch {
            toDoTaskRepository.getAllTasks.collect {
                _allTasks.value = it
            }
        }
    }
}
