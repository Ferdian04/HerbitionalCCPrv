package com.example.herbitional.ui.home

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.herbitional.R
import com.example.herbitional.data.Medicine
import com.example.herbitional.ui.detail_history.DetailHistoryActivity
import com.example.herbitional.ui.detail_medicine.DetailMedicineActivity

class RecomendationAdapter(private val medicineList: ArrayList<Medicine>) : RecyclerView.Adapter<RecomendationAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val medicine_image: ImageView = itemView.findViewById(R.id.iv_medicine_image)
        val medicine_name: TextView = itemView.findViewById(R.id.tv_medicine_name)
        val medicine_composition: TextView = itemView.findViewById(R.id.tv_medicine_composition)
        val medicine_efficacy: TextView = itemView.findViewById(R.id.tv_medicine_efficacy)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_medicine, parent, false)
        return RecomendationAdapter.MyViewHolder(itemView)
    }

    override fun getItemCount(): Int = medicineList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = medicineList[position]
        holder.medicine_image.setImageResource(currentItem.medicine_image)
        holder.medicine_name.text = currentItem.medicine_name
        holder.medicine_composition.text = currentItem.medicine_composition
        holder.medicine_efficacy.text = currentItem.medicine_efficacy

//      ketika item diklik dan ke detail obat
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailMedicineActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }
    }
}