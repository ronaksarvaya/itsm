package com.example.alert_dialog_fragment

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var btncall: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btncall = findViewById(R.id.btn1)

        btncall.setOnClickListener {

            val fragment = BlankFragment()

            supportFragmentManager
                .beginTransaction()
                .add(android.R.id.content, fragment)
                .addToBackStack(null)
                .commit()
        }
    }
}