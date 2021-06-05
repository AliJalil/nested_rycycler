package com.example.nestedrecycler.data

import com.example.nestedrecycler.R
import java.util.*

object ChildDataFactory {

    private val random = Random()

    val children = mutableListOf<ChildModel>(
        ChildModel(
            "Aviator",
            "https://images-na.ssl-images-amazon.com/images/S/pv-target-images/896fa73f5155d71480379a4cb183d575c99b62de56d2ae85c6adbeafc0a6a4bf._RI_V_TTW_.jpg"
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
            "https://m.media-amazon.com/images/M/MV5BNjRlZmM0ODktY2RjNS00ZDdjLWJhZGYtNDljNWZkMGM5MTg0XkEyXkFqcGdeQXVyNjAwMjI5MDk@._V1_.jpg"
        ),
        ChildModel(
            "pk",
            "https://i.insider.com/5d1b8c0921a86101397d9f74?width=600&format=jpeg&auto=webp"
        ),
        ChildModel("Rock of ages", "https://bestsimilar.com/img/movie/thumb/83/4612.jpg"),
        ChildModel(
            "Zootopia",
            "https://tech4gamers.com/wp-content/uploads/2015/03/maxresdefault.jpg"
        ),
        ChildModel("The Nut Job", "https://i.ebayimg.com/images/g/ugwAAOSwrWBeUneX/s-l600.jpg"),

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