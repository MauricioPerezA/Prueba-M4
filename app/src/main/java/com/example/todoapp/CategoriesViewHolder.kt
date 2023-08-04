package com.example.todoapp

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class CategoriesViewHolder(view:View): RecyclerView.ViewHolder(view) {
    private val tvCategoryName: TextView = view.findViewById(R.id.tvCategoryName)
    private val divider: View = view.findViewById(R.id.divider)
    private val viewContainer:CardView = view.findViewById(R.id.viewContainer)

    fun render(taskCategory: TasksCategory, onItemSelected: (Int) -> Unit) {

        val color = if(taskCategory.isSelected){
            R.color.green_dark
        }else{
            com.google.android.material.R.color.material_on_background_disabled
        }
        viewContainer.setCardBackgroundColor(ContextCompat.getColor(viewContainer.context,color))

        itemView.setOnClickListener{ onItemSelected(layoutPosition)}

        when (taskCategory){
            TasksCategory.Aplicaciones -> {
                tvCategoryName.text = "Aplicaciones"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context,R.color.fluor_green)
                )
            }
            TasksCategory.Personal -> {
                tvCategoryName.text = "Personal"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context,R.color.blue_stone)
                )
            }
            TasksCategory.Teocratico -> {
                tvCategoryName.text = "Teocratico"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context,R.color.fluor_yelow)
                )
            }
        }

    }
}