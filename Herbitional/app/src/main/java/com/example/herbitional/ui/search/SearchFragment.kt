package com.example.herbitional.ui.search

import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.herbitional.R
import com.example.herbitional.data.Medicine


class SearchFragment : Fragment() {
    private lateinit var adapter: MedicineAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var medicineArrayList: ArrayList<Medicine>
    private lateinit var searchView: SearchView

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
        val view = inflater.inflate(R.layout.fragment_search,container,false)

//        Inisialisasi searchViewnya

        searchView = view.findViewById(R.id.searchView)
        val fontSize = 14

        val searchEditText = searchView.findViewById<EditText>(androidx.appcompat.R.id.search_src_text)
        searchEditText.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize.toFloat())



//        Ketika input
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
//                TODO("Not yet implemented") ketika tombol enter ditekan
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
//                TODO("Not yet implemented") ketika query pencarian berubah
                return false
            }
        })

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rv_medicine_list)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MedicineAdapter(medicineArrayList)
        recyclerView.adapter = adapter
    }

    companion object {

    }

    private fun init() {
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