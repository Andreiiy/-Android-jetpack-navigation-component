package com.atatar.navigationexample.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.atatar.navigationexample.R
import kotlinx.android.synthetic.main.item_list.view.*
import java.util.zip.Inflater

class RVAdapter(var names:ArrayList<String>,val context:Context): RecyclerView.Adapter<RVAdapter.RVHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVHolder {
        return RVHolder(
            LayoutInflater.from(context).inflate(R.layout.item_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RVHolder, position: Int) {
        holder.bind(names[position])
    }

    override fun getItemCount(): Int {
       return names.size
    }

    class RVHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(name: String) {
            itemView.tv_name.text = name
        }

    }

}