package com.example.nestedrecycler.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.nestedrecycler.R
import com.example.nestedrecycler.data.ChildModel
import com.example.nestedrecycler.util.imageLoader
import kotlinx.android.synthetic.main.child_recycler.view.*

class ChildAdapter(private val children : List<ChildModel>)
    : RecyclerView.Adapter<ChildAdapter.ViewHolder>(){

    private var context: Context? = null
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {

        val v =  LayoutInflater.from(parent.context)
            .inflate(R.layout.child_recycler,parent,false)
        context = parent.context
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return children.size
    }

    override fun onBindViewHolder(holder: ViewHolder,
                                  position: Int) {
        val child = children[position]
        context?.let { imageLoader(child.image,holder.imageView, it) }
        holder.textView.text = child.title
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val textView : TextView = itemView.child_textView
        val imageView: ImageView = itemView.child_imageView
    }
}
