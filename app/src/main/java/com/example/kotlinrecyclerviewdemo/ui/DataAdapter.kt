package com.example.kotlinrecyclerviewdemo.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.kotlinrecyclerviewdemo.R

class DataAdapter(val items: ArrayList<String>) : RecyclerView.Adapter<MyViewHolder>() {

    override fun getItemCount() : Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textview.text = items.get(position)
    }
}