package com.example.todoapp

sealed class TasksCategory(var isSelected:Boolean = true) {
    object Personal:TasksCategory()
    object Teocratico: TasksCategory()
    object Aplicaciones: TasksCategory()
}

