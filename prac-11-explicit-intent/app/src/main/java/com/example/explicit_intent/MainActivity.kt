package com.example.explicit_intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.texts)
        button = findViewById(R.id.send)

        button.setOnClickListener {

            val intent = Intent(this,seconds::class.java)

            intent.putExtra("message",editText.text.toString())

            startActivity(intent)
        }
    }
}