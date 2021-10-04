package com.example.registrationform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    companion object{
        const val name="name"
        const val uid="uid"
        const val course="course"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var name=intent.getStringExtra(name)
        var uid=intent.getStringExtra(uid)
        var course=intent.getStringExtra(course)
        var display:TextView=findViewById(R.id.display)

display.setText("Name: "+name+"\n Uid: "+uid+"\n course: "+course)
    }
}