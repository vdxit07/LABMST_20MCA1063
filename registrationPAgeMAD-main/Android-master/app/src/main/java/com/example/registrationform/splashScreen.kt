package com.example.registrationform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class splashScreen : AppCompatActivity() {
    var delay_time:Long=3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        android.os.Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },delay_time)
    }
}