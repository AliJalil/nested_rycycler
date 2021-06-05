package com.example.nestedrecycler.util

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.nestedrecycler.R

fun imageLoader(imgUrl :String,imgView :ImageView,context : Context)
{
    context.let {
        Glide.with(it)
            .load(imgUrl)
            .placeholder(R.drawable.movie)
            .error(R.drawable.error)
            .into(imgView)
    }
}