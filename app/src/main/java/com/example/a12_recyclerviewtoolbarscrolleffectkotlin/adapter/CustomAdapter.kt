package com.example.a12_recyclerviewtoolbarscrolleffectkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a12_recyclerviewtoolbarscrolleffectkotlin.R
import com.example.a12_recyclerviewtoolbarscrolleffectkotlin.model.Member

class CustomAdapter(val members: List<Member>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout_view, parent, false)
        return CustomViewHolder(view)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = members.get(position)
        if (holder is CustomViewHolder){
            holder.tv_name.setText(member.tv_name)
            holder.tv_tel_number.setText(member.tv_tel_number)
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tv_name = view.findViewById<TextView>(R.id.tv_name)
        val tv_tel_number = view.findViewById<TextView>(R.id.tv_tel_number)
    }

}
