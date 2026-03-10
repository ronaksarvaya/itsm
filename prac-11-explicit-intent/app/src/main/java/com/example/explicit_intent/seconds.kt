package com.example.explicit_intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class seconds : AppCompatActivity() {

    lateinit var button: Button
    lateinit var editText: TextView
    lateinit var viewtext : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seconds)

        button = findViewById(R.id.send_button)
        editText = findViewById(R.id.textdisplay)
        viewtext = findViewById(R.id.msg)

        var bundle : Bundle ? = intent.extras
        var message = bundle!!.get("message")

        editText.text=message.toString()

        button.setOnClickListener {

            startActivity(Intent(this,MainActivity::class.java))

        }
    }
}