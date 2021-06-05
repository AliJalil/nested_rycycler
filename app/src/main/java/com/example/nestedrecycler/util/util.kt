package com.example.nestedrecycler.util

import android.content.Context
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.nestedrecycler.R

fun imageLoader(imgUrl :String,imgView :ImageView,context : Context)
{
    Log.v("imgUrl ",imgUrl)
    context.let {
        Glide.with(it)
            .load(imgUrl)
            .placeholder(R.drawable.movie)
            .error(R.drawable.error)
            .into(imgView)
    }
}