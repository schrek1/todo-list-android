package com.example.todolist.di

import android.content.Context
import androidx.room.Room
import com.example.todolist.model.db.ToDoAppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext
        context: Context
    ) = Room.databaseBuilder(
        context,
        ToDoAppDatabase::class.java,
        ToDoAppDatabase.DATABASE_NANE
    ).build()

    @Singleton
    @Provides
    fun provideToDoTaskDao(database: ToDoAppDatabase) = database.toDoTaskDao()
}
