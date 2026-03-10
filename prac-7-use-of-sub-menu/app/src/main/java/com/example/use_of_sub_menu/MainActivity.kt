package com.example.use_of_sub_menu

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.my_toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            R.id.about -> {
                Toast.makeText(this, "About Selected", Toast.LENGTH_SHORT).show()
            }

            R.id.help -> {
                Toast.makeText(this, "Help Selected", Toast.LENGTH_SHORT).show()
            }

            R.id.feedback -> {
                Toast.makeText(this, "Feedback Selected", Toast.LENGTH_SHORT).show()
            }

            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }
}






//output :
//⋮  (3 dots menu)
//   Setting >
//      About
//      Help
//      Feedback