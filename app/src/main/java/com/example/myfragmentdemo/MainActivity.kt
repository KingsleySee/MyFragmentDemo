package com.example.myfragmentdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btnCall)

        btn.setOnClickListener(){
            var number = Uri.parse("geo:1479, -16.0511")
            var intent = Intent(Intent.ACTION_VIEW, number)
            startActivity(intent)
        }
    }
}