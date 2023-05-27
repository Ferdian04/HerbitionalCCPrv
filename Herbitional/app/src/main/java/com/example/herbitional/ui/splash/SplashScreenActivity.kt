package com.example.herbitional.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.herbitional.MainActivity
import com.example.herbitional.R
import com.example.herbitional.databinding.ActivityMainBinding
import com.example.herbitional.databinding.ActivitySplashScreenBinding
import com.example.herbitional.ui.login.LoginActivity

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed(Runnable {
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        }, 3000)
    }
}
