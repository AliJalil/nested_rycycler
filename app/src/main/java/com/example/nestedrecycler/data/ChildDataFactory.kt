package com.example.nestedrecycler.data

import com.example.nestedrecycler.R
import java.util.*

object ChildDataFactory {

    private val random = Random()

    val children = mutableListOf<ChildModel>(
        ChildModel(
            "Aviator",
            "https://upload.wikimedia.org/wikipedia/en/f/fa/The_Aviator_%282004%29.png"
        ),
        ChildModel(
            "Now you can See me",
            "https://resizing.flixster.com/Spc60Xz-JLU8_Xxlk4-o39FFddE=/206x305/v2/https://flxt.tmsimg.com/assets/p9418112_p_v10_aq.jpg"
        ),
        ChildModel(
            "God Father",
            "https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UY1200_CR107,0,630,1200_AL_.jpg"
        ),
        ChildModel(
            "Mission Impossible",
            "https://m.media-amazon.com/images/M/MV5BNjRlZmM0ODktY2RjNS00ZDdjLWJhZGYtNDljNWZkMGM5MTg0XkEyXkFqcGdeQXVyNjAwMjI5MDk@._V1_.jpg"
        ),
        ChildModel(
            "3 idiots",
            "https://m.media-amazon.com/images/M/MV5BNTkyOGVjMGEtNmQzZi00NzFlLTlhOWQtODYyMDc2ZGJmYzFhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_.jpg"
        ),
        ChildModel(
            "pk",
            "https://m.media-amazon.com/images/M/MV5BMTYzOTE2NjkxN15BMl5BanBnXkFtZTgwMDgzMTg0MzE@._V1_.jpg"
        ),
        ChildModel("Rock of ages", "https://musicart.xboxlive.com/7/da411100-0000-0000-0000-000000000002/504/image.jpg?w=1920&h=1080"),
        ChildModel(
            "Zootopia",
            "https://images.moviesanywhere.com/cac313fcf9373e9446b6bb8ff171b8d1/8b8d6a81-b8e6-49ad-b835-32c2f01a03c5.jpg"
        ),
        ChildModel("The Nut Job", "https://images-na.ssl-images-amazon.com/images/I/81pBQmQozhL._SL1500_.jpg"),

        )


    private fun randomChild(): ChildModel {
        val index = random.nextInt(children.size)
        return children[index]
    }

    fun getChildren(count: Int): List<ChildModel> {
        val mChild = mutableListOf<ChildModel>()
        repeat(count) {
            mChild.add(randomChild())
        }
        return mChild
    }
}