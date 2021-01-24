package com.example.nestedrecyclerview.ExpandableNestedRecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.ExpandableRecyclerView.VersionAdapter
import com.example.nestedrecyclerview.ExpandableRecyclerView.Versions
import com.example.nestedrecyclerview.R

class MainActivity4 : AppCompatActivity() {

    val versionList = ArrayList<Versions1>()
    val childList = ArrayList<ListItem>()
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        recyclerView = findViewById(R.id.recycler_view)

        initData()
        setRecyclerView()
    }
    private fun setRecyclerView() {
        val versionAdapter = VersionAdapter1(versionList,childList)
        recyclerView.adapter =  versionAdapter
        recyclerView.setHasFixedSize(true)

    }

    private fun initData() {
        versionList.add(Versions1("Android-10","version-10","Api Level-29","Abcdefghijklmnopqrstuvwxyz"))
        versionList.add(Versions1("Android-10","version-10","Api Level-29","Abcdefghijklmnopqrstuvwxyz"))
        versionList.add(Versions1("Android-10","version-10","Api Level-29","Abcdefghijklmnopqrstuvwxyz"))
        versionList.add(Versions1("Android-10","version-10","Api Level-29","Abcdefghijklmnopqrstuvwxyz"))
        versionList.add(Versions1("Android-10","version-10","Api Level-29","Abcdefghijklmnopqrstuvwxyz"))
        versionList.add(Versions1("Android-10","version-10","Api Level-29","Abcdefghijklmnopqrstuvwxyz"))
        versionList.add(Versions1("Android-10","version-10","Api Level-29","Abcdefghijklmnopqrstuvwxyz"))

        childList.add(ListItem("A","AAAAAAA"))
        childList.add(ListItem("B","BBBBBBBB"))
        childList.add(ListItem("C","CCCCCCC"))
        childList.add(ListItem("D","DDDDDDD"))
        childList.add(ListItem("E","EEEEEEE"))
    }
}