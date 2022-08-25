package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val button =  findViewById<Button>(R.id.btnSubmit).setOnClickListener{
            Toast.makeText(this, "Button is clicked", Toast.LENGTH_SHORT).show()

           counter ++
           findViewById<TextView>(R.id.count).text = counter.toString()
        }
    }
}