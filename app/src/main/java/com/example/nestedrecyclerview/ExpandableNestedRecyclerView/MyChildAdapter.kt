package com.example.nestedrecyclerview.ExpandableNestedRecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.R

class MyChildAdapter(val childList:List<ListItem>):RecyclerView.Adapter<MyChildAdapter.ChildViewHolder>() {
    class ChildViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
        var title:TextView = itemView.findViewById(R.id.text_view_child_item_title)
        var description:TextView = itemView.findViewById(R.id.text_view_child_item_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.child_item_card,parent,false)
        return ChildViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        val  childItem = childList[position]
        holder.title.text = childItem.title
        holder.description.text = childItem.description
    }

    override fun getItemCount(): Int {
        return childList.size
    }
}