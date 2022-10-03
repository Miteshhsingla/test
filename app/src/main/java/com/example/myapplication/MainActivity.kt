package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    val et:EditText=findViewById(R.id.et)
    val name = et.text
    var intent: Intent = Intent(this,MainActivity2::class.java)

    StartActivity(intent)
}