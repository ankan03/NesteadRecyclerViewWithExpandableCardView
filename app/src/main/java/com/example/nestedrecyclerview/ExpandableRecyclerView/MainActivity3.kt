package com.example.nestedrecyclerview.ExpandableRecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.R

class MainActivity3 : AppCompatActivity() {

    val versionList = ArrayList<Versions>()
    lateinit var recyclerView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        recyclerView = findViewById(R.id.recycler_view)

        initData()
        setRecyclerView()

    }

    private fun setRecyclerView() {
        val versionAdapter = VersionAdapter(versionList)
        recyclerView.adapter =  versionAdapter
        recyclerView.setHasFixedSize(true)

    }

    private fun initData() {
        versionList.add(Versions("Android-10","version-10","Api Level-29","AAAAAa BBBB CCCCC DDDD"))
        versionList.add(Versions("Android-10","version-10","Api Level-29","AAAAAa BBBB CCCCC DDDD"))
        versionList.add(Versions("Android-10","version-10","Api Level-29","AAAAAa BBBB CCCCC DDDD"))
        versionList.add(Versions("Android-10","version-10","Api Level-29","AAAAAa BBBB CCCCC DDDD"))
        versionList.add(Versions("Android-10","version-10","Api Level-29","AAAAAa BBBB CCCCC DDDD"))
        versionList.add(Versions("Android-10","version-10","Api Level-29","AAAAAa BBBB CCCCC DDDD"))
        versionList.add(Versions("Android-10","version-10","Api Level-29","AAAAAa BBBB CCCCC DDDD"))
    }
}