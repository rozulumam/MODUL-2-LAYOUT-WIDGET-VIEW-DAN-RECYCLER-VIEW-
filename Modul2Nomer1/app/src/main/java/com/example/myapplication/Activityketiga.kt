package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class Activityketiga : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tugas2_p1_no2)

        val button2 = findViewById(R.id.button2) as Button
        button2.setOnClickListener {
            val Intent = Intent(this,Activitykeempat::class.java)
            startActivity(Intent)
        }
    }
}
