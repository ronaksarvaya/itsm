package com.example.listview_with_4_items

import android.os.Bundle
import android.view.Gravity
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class MainActivity : AppCompatActivity() {
    lateinit var mylist: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        mylist = findViewById(R.id.listview)
        val country = arrayOf("India", "Russia", "Canada", "America")
        mylist.adapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, country)

        mylist.setOnItemClickListener { _, _, position, _ ->
            val toast = Toast.makeText(
                this,
                "Hello " + country[position],
                Toast.LENGTH_LONG
            )
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }
    }
}