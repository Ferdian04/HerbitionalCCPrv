package com.example.herbitional.ui.profile

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.herbitional.R
import com.example.herbitional.data.Disease
import com.example.herbitional.ui.detail_history.DetailHistoryActivity

class HistoryAdapter(private val diseaseList: ArrayList<Disease>) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {
    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val diseaseName : TextView = itemView.findViewById(R.id.tv_disease_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_history, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return diseaseList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = diseaseList[position]
        holder.diseaseName.text = currentItem.name

//        ketika item diklik dan ke detail history
        holder.diseaseName.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailHistoryActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }

    }

}