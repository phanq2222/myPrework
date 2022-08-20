package com.example.myprework

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHello : Button = findViewById<Button>(R.id.btnSayHello)
        btnHello.setOnClickListener{

            Log.v("Hello world!","Button clicked")

        }

    }
}