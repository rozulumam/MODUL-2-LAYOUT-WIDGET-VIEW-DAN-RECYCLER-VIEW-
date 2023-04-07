package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tugas2_p1_no3)

        val btn_daftar = findViewById(R.id.btn_daftar) as Button
        btn_daftar.setOnClickListener {
            Toast.makeText(this, "Berhasil Daftar silahkan login", Toast.LENGTH_SHORT).show()
            val Intent = Intent(this,SecondActivity::class.java)
            startActivity(Intent)
        }




    }
}