package com.example.herbitional.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.herbitional.MainActivity
import com.example.herbitional.databinding.ActivityLoginBinding
import com.example.herbitional.ui.register.RegisterActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        forgetPassword()
        login()
        register()



    }


//    Fungsi lupa password
    private fun forgetPassword(){
        binding.tvForgetPassword.setOnClickListener {
            Toast.makeText(this, "Konten Belum Tersedia", Toast.LENGTH_SHORT).show()
        }
    }


//    Fungsi ketika klik tombol masuk

    private fun login(){
        binding.btnLogin.setOnClickListener {
//            Ke halaman Home
            startActivity(Intent(this,MainActivity::class.java))
        }
    }


//    Fungsi ketika klik tv daftar
    private fun register(){
        binding.tvRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
