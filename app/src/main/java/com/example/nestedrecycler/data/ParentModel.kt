package com.example.nestedrecycler.data

data class ParentModel (
    val title : String = "",
    val children : List<ChildModel>
)