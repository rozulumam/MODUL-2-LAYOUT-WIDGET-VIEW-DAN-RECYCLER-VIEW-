package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button8 = findViewById(R.id.button8) as Button
        button8.setOnClickListener {
            Toast.makeText(this, "Berhasil login", Toast.LENGTH_SHORT).show()
            val Intent = Intent(this,Activityketiga::class.java)
            startActivity(Intent)
    }
    }
}