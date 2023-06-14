package com.ritikcoder.project21ofandroiddev_listview2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.ritikcoder.project21ofandroiddev_listview2.databinding.ActivitySplashScreenBinding

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {

    lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 1000)
    }
}