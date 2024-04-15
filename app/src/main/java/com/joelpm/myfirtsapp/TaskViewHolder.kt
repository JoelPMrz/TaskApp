package com.joelpm.myfirtsapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val tvTask: TextView = view.findViewById(R.id.tvTask)
    private val ivCheck: ImageView = view.findViewById(R.id.ivCheck)

    fun render(task: String, onItemDone: (Int) -> Unit){
        tvTask.text = task
        ivCheck.setOnClickListener {onItemDone(adapterPosition)}
    }
}