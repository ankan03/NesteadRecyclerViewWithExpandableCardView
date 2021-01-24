package com.example.nestedrecyclerview.NestedRecyclerView

data class ParentModel (
    val title : String = "",
    val children : List<ChildModel>
)