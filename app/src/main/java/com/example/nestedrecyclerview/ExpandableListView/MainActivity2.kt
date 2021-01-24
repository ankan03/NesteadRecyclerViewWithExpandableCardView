package com.example.nestedrecyclerview.ExpandableListView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListView
import com.example.nestedrecyclerview.R

class MainActivity2 : AppCompatActivity() {

    val header:MutableList<String> = ArrayList()
    val body:MutableList<MutableList<String>> = ArrayList()
    lateinit var expandableListView:ExpandableListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        expandableListView = findViewById(R.id.expandable_list_view)

        title = "Ankan Mukherjee"

        val season1 :MutableList<String> = ArrayList()
        season1.add("a")
        season1.add("a")
        season1.add("a")
        season1.add("a")
        season1.add("a")

        val season2 :MutableList<String> = ArrayList()
        season2.add("b")
        season2.add("b")
        season2.add("b")
        season2.add("b")
        season2.add("b")

        val season3:MutableList<String> = ArrayList()
        season3.add("c")
        season3.add("c")
        season3.add("c")
        season3.add("c")
        season3.add("c")

        val season4:MutableList<String> = ArrayList()
        season4.add("d")
        season4.add("d")
        season4.add("d")
        season4.add("d")
        season4.add("d")

        val season5:MutableList<String> = ArrayList()
        season5.add("e")
        season5.add("e")
        season5.add("e")
        season5.add("e")
        season5.add("e")
        
        header.add("Season-1")
        header.add("Season-2")
        header.add("Season-3")
        header.add("Season-4")
        header.add("Season-5")

        body.add(season1)
        body.add(season2)
        body.add(season3)
        body.add(season4)
        body.add(season5)

        expandableListView.setAdapter(ExpandableListAdapter(this,expandableListView,header,body))

    }
}