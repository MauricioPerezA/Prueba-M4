package com.example.todoapp

import android.content.res.ColorStateList
import android.graphics.Paint
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class TasksViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val tvTask:TextView = view.findViewById(R.id.tvTask)
    private val cbTask:CheckBox = view.findViewById(R.id.cbTask)

    fun render(task: Task){
        if (task.isSelected){
            tvTask.paintFlags = tvTask.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        }else{
            tvTask.paintFlags = tvTask.paintFlags and  Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }
        cbTask.isChecked= task.isSelected
        tvTask.text = task.name

        var color = when (task.category){
            TasksCategory.Aplicaciones -> R.color.fluor_green
            TasksCategory.Personal -> R.color.blue_stone
            TasksCategory.Teocratico -> R.color.fluor_yelow
        }

        cbTask.buttonTintList = ColorStateList.valueOf(
            ContextCompat.getColor(cbTask.context,color)
        )
    }
}