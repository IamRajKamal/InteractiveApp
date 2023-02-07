package com.example.interactiveapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark= findViewById<Button>(R.id.btnDark)
        val buttonlight=findViewById<Button>(R.id.btnRead)
        val layout= findViewById<LinearLayout>(R.id.LinearLayout)
        val buttonLearningAppdevfrom= findViewById<Button>(R.id.btnLearningAppdevfrom)

        buttonlight.setOnClickListener {
            //change to light mode
            layout.setBackgroundResource(R.color.yellow)

        }

        buttonDark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }

        buttonLearningAppdevfrom.setOnClickListener {
            Toast.makeText(applicationContext, "SAUMYA SINGH DI", Toast.LENGTH_SHORT).show()
        }

        buttonlight.setOnClickListener {
            Toast.makeText(applicationContext,"changing..", Toast.LENGTH_SHORT).show()
        }
        }
    }
