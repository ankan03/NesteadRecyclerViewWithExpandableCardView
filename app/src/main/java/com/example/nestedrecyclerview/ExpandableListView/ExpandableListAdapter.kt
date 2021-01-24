package com.example.nestedrecyclerview.ExpandableListView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ExpandableListView
import android.widget.TextView
import android.widget.Toast
import com.example.nestedrecyclerview.R

class ExpandableListAdapter(var context:Context, var expandableListView: ExpandableListView, var header:MutableList<String>, var body:MutableList<MutableList<String>>): BaseExpandableListAdapter() {
    override fun getGroupCount(): Int {
        return header.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return body[groupPosition].size
    }

    override fun getGroup(groupPosition: Int): String {
        return header[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): String {
        return body[groupPosition][childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(groupPosition: Int, isExpandable: Boolean, view: View?, parent: ViewGroup?): View {
        var convertView = view
        if (convertView == null){
            val inflater= context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.layout_group,null)
        }
        val title = convertView!!.findViewById<TextView>(R.id.tv_title_group)
        title.text = getGroup(groupPosition)
        title.setOnClickListener {
            if (expandableListView.isGroupExpanded(groupPosition)){
                expandableListView.collapseGroup(groupPosition)
            }else{
                expandableListView.expandGroup(groupPosition)
            }
            Toast.makeText(context, getGroup(groupPosition), Toast.LENGTH_SHORT).show()
        }
        return convertView
    }

    override fun getChildView(groupPosition: Int, childPosition: Int, isExpandable: Boolean, view: View?, parent: ViewGroup?): View {
        var convertView = view
        if (convertView == null){
            val inflater= context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.layout_child,null)
        }
        val title = convertView!!.findViewById<TextView>(R.id.tv_title_child)
        title.text = getChild(groupPosition,childPosition)
        title.setOnClickListener {
            Toast.makeText(context, getChild(groupPosition,childPosition), Toast.LENGTH_SHORT).show()
        }
        return convertView
    }

    override fun isChildSelectable(groupPosition: Int, p1: Int): Boolean {
        return true
    }
}