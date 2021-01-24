package com.example.nestedrecyclerview.ExpandableNestedRecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.NestedRecyclerView.ChildAdapter
import com.example.nestedrecyclerview.R

class VersionAdapter1(val versionList:List<Versions1>, val childList:List<ListItem>):RecyclerView.Adapter<VersionAdapter1.VersionVH>() {
    class VersionVH(itemView:View):RecyclerView.ViewHolder(itemView) {
        var codeNametext:TextView = itemView.findViewById(R.id.code_name1)
        var versionTxt:TextView = itemView.findViewById(R.id.version1)
        var apiLevelTxt:TextView = itemView.findViewById(R.id.api_level1)
        var descriptionTxt:TextView = itemView.findViewById(R.id.description1)
        var linearLayout:LinearLayout = itemView.findViewById(R.id.linear_layout1)
        var expandableLayout:RelativeLayout = itemView.findViewById(R.id.expandable_layout1)
        var recyclerView:RecyclerView = itemView.findViewById(R.id.rec_view_inside_card_view)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VersionVH {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.row1,parent,false)
        return VersionVH(view)
    }

    override fun onBindViewHolder(holder: VersionVH, position: Int) {
        val versions1 = versionList[position]
        holder.codeNametext.text = versions1.codeName
        holder.versionTxt.text = versions1.version
        holder.apiLevelTxt.text = versions1.apiLevel
        holder.descriptionTxt.text = versions1.description

        val isExpandable:Boolean = versionList[position].expandable
        holder.expandableLayout.visibility = if (isExpandable) View.VISIBLE else View.GONE

        holder.linearLayout.setOnClickListener {
            val versions = versionList[position]
            versions.expandable = !versions.expandable
            notifyItemChanged(position)
        }

        val childLayoutManager = LinearLayoutManager(holder.recyclerView.context,LinearLayoutManager.VERTICAL, false)
        holder.recyclerView.apply {
            layoutManager = childLayoutManager
            adapter = MyChildAdapter(childList)
        }
    }

    override fun getItemCount(): Int {
        return versionList.size
    }
}