package com.example.herbitional.ui.detail_history

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.herbitional.data.Medicine
import com.example.herbitional.databinding.ActivityDetailHistoryBinding
import com.example.herbitional.ui.home.RecomendationAdapter

class DetailHistoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailHistoryBinding

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RecomendationAdapter
    private lateinit var medicineArrayList: ArrayList<Medicine>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}