package com.example.herbitional.ui.profile

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.herbitional.R
import com.example.herbitional.data.Disease
import com.example.herbitional.ui.login.LoginActivity


class ProfileFragment : Fragment() {
    private lateinit var adapter: HistoryAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var historyArrayList: ArrayList<Disease>

    lateinit var diseaseName: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container,false)

        val buttonLogout = view.findViewById<ImageView>(R.id.iv_logout)
        buttonLogout.setOnClickListener {
            showLogOutDialog()
        }
        return view
    }

    companion object {

    }

    private fun showLogOutDialog(){
        val dialogView = LayoutInflater.from(requireContext()).inflate(R.layout.dialog_logout, null)
        val dialogBuilder = AlertDialog.Builder(requireContext())
            .setView(dialogView)
            .setCancelable(false)

        val dialog = dialogBuilder.show()

        val btnCancel = dialogView.findViewById<Button>(R.id.btn_cancel)
        val btnLogOut = dialogView.findViewById<Button>(R.id.btn_logout)

        btnCancel.setOnClickListener {
            dialog.dismiss()
        }

        btnLogOut.setOnClickListener {
            val intent = Intent(requireContext(), LoginActivity::class.java)
            startActivity(intent)
            dialog.dismiss()
        }


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rv_history_list)
        recyclerView.layoutManager = layoutManager
        adapter = HistoryAdapter(historyArrayList)
        recyclerView.adapter = adapter
    }

    private fun init() {
        historyArrayList = arrayListOf<Disease>()

        diseaseName = arrayOf(
            getString(R.string.disease_name),
            getString(R.string.disease_name),
            getString(R.string.disease_name),
            getString(R.string.disease_name),
            getString(R.string.disease_name),
            getString(R.string.disease_name),
            getString(R.string.disease_name),
            getString(R.string.disease_name),
            getString(R.string.disease_name),
            getString(R.string.disease_name),
        )

        for (i in diseaseName.indices){
            val disease = Disease(diseaseName[i])
            historyArrayList.add(disease)
        }
    }
}