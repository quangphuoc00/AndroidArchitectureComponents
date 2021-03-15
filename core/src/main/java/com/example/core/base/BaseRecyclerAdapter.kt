package com.example.core.base

import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

abstract class BaseRecyclerAdapter<T> : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    protected var items = ArrayList<T>()

    override fun getItemCount() = items.size

    fun setItems(data: List<T>) {
        items.clear();
        items.addAll(data)
        notifyDataSetChanged()
    }

    fun addItems(data: List<T>) {
        val crrItemPosition = items.size
        items.addAll(data)
        notifyItemRangeInserted(crrItemPosition, items.size - 1)
    }
}