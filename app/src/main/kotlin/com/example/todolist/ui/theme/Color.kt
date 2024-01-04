package com.example.todolist.ui.theme

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val LightGray = Color(0xFFFCFCFC)
val MediumGray = Color.LightGray
val DarkGray = Color.DarkGray

val LowPriorityColor = Color(0x0fdc32)
val MediumPriorityColor = Color(0xffe513)
val HighPriorityColor = Color(0xdc1522)
val NonePriorityColor = Color(0xfff9f8)


val Colors.topAppBarContentColor: Color
    get() = if (isLight) Color.White else LightGray

val Colors.topAppBarBackgroundColor: Color
    get() = if (isLight) Purple500 else Color.Black
