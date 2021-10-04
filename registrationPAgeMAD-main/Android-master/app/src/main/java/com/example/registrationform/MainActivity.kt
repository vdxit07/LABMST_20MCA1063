package com.example.registrationform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name:EditText=findViewById(R.id.name)
        var uid:EditText=findViewById(R.id.uid)
        var course:EditText=findViewById(R.id.course)
        var btn:Button=findViewById(R.id.btn)
        btn.setOnClickListener {
        var nameVal=name.text.toString()
            var uidVal=uid.text.toString()
            var courseVal=course.text.toString()
            val intent=Intent(this,SecondActivity::class.java)
            intent.putExtra(SecondActivity.name,nameVal)
            intent.putExtra(SecondActivity.uid,uidVal)
            intent.putExtra(SecondActivity.course,courseVal)
            startActivity(intent)

        }


    }
}