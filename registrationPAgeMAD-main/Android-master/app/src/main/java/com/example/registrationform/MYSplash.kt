package com.example.registrationform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MYSplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysplash)
        android.os.Handler().postDelayed(
            {
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            },10000)
    }
}