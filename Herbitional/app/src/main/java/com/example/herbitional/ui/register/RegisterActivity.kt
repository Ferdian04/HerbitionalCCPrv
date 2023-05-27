package com.example.herbitional.ui.register

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.herbitional.MainActivity
import com.example.herbitional.databinding.ActivityRegisterBinding
import com.example.herbitional.ui.login.LoginActivity

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        register()
        backToLogin()
    }


//    Fungsi ketika tekan tombol daftar
    private fun register(){
        binding.btnRegister.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }

//    Fungsi ketika tekan tulisan masuk
    private fun backToLogin(){
        binding.tvLogin.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}