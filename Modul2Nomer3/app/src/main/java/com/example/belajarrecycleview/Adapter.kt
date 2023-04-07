package com.example.belajarrecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarrecycleview.databinding.ListBinding


class Adapter (private val list: ArrayList<Users>) : RecyclerView.Adapter<Adapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(list[position])
    }

    class Holder(val view: View) : RecyclerView.ViewHolder(view){
        private val binding = ListBinding.bind(view)
        fun bind (o: Users){
            binding.lbList.text = o.name
            binding.root.setOnClickListener{
                Toast.makeText(itemView.context,"Hallo ${o.name}",Toast.LENGTH_SHORT).show()
            }
        }
    }

}