package com.example.herbitional.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.herbitional.R
import com.example.herbitional.data.Medicine

class HomeFragment : Fragment() {

    private lateinit var adapter: RecomendationAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var medicineArrayList: ArrayList<Medicine>

    lateinit var medicineImage : Array<Int>
    lateinit var medicineName: Array<String>
    lateinit var medicineComposition: Array<String>
    lateinit var medicineEfficacy: Array<String>
    lateinit var medicine: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_home, container,false)

        val button = view.findViewById<Button>(R.id.btn_survey)
        button.setOnClickListener {
            Toast.makeText(requireContext(),"Konten belum tersedia", Toast.LENGTH_SHORT).show()
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rv_medicine_recomendation)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = RecomendationAdapter(medicineArrayList)
        recyclerView.adapter = adapter
    }


    companion object {

    }


    private fun init(){
        medicineArrayList = arrayListOf<Medicine>()

        medicineImage = arrayOf(
            R.drawable.medicine,
            R.drawable.medicine,
            R.drawable.medicine,
            R.drawable.medicine,
            R.drawable.medicine,
            R.drawable.medicine,
            R.drawable.medicine,
            R.drawable.medicine,
            R.drawable.medicine,
            R.drawable.medicine,
        )

        medicineName = arrayOf(
            getString(R.string.nama_obat),
            getString(R.string.nama_obat),
            getString(R.string.nama_obat),
            getString(R.string.nama_obat),
            getString(R.string.nama_obat),
            getString(R.string.nama_obat),
            getString(R.string.nama_obat),
            getString(R.string.nama_obat),
            getString(R.string.nama_obat),
            getString(R.string.nama_obat),
        )

        medicineComposition = arrayOf(
            getString(R.string.komposisi_obat),
            getString(R.string.komposisi_obat),
            getString(R.string.komposisi_obat),
            getString(R.string.komposisi_obat),
            getString(R.string.komposisi_obat),
            getString(R.string.komposisi_obat),
            getString(R.string.komposisi_obat),
            getString(R.string.komposisi_obat),
            getString(R.string.komposisi_obat),
            getString(R.string.komposisi_obat),
        )

        medicineEfficacy = arrayOf(
            getString(R.string.khasiat_obat),
            getString(R.string.khasiat_obat),
            getString(R.string.khasiat_obat),
            getString(R.string.khasiat_obat),
            getString(R.string.khasiat_obat),
            getString(R.string.khasiat_obat),
            getString(R.string.khasiat_obat),
            getString(R.string.khasiat_obat),
            getString(R.string.khasiat_obat),
            getString(R.string.khasiat_obat),
        )


        for (i in medicineImage.indices){
            val medicine = Medicine(medicineImage[i],medicineName[i],medicineComposition[i],medicineEfficacy[i])
            medicineArrayList.add(medicine)
        }
    }
}