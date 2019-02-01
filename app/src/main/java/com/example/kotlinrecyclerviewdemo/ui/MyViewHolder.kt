package com.example.kotlinrecyclerviewdemo.ui

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.row_layout.view.*

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val textview: TextView = itemView.row_item
}