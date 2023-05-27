package com.example.herbitional.ui.detail_medicine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.herbitional.databinding.ActivityDetailMedicineBinding

class DetailMedicineActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailMedicineBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMedicineBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }


}