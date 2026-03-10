package com.example.use_of_fragments

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.btn1)
        val button2 = findViewById<Button>(R.id.btn2)

        button1.setOnClickListener {
            loadFragment(Fragment_1())
        }
        button2.setOnClickListener {
            loadFragment(Fragment_2())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_1, fragment)
            .commit()
    }
}














//create fragment file:
//
//app > kotlin + java > your package name > right click it > New → Fragment → Fragment (Blank)
//
//
//Fragment Name: Fragment_1
//Layout Name: fragment_1


//Create Fragment 2
//Same steps:
//
//Fragment Name: Fragment_2
//Layout Name: fragment_2
//
//step 5 :
//app > res > layout
//step 5 :
//app > res > layout
//
//fragement_1.xml
//<?xml version="1.0" encoding="utf-8"?>
//<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent">
//
//    <TextView
//        android:layout_width="match_parent"
//        android:layout_height="match_parent"
//        android:text="Hello from Fragment 1"
//        android:textSize="24sp"
//        android:gravity="center"
//        android:background="@android:color/holo_red_light"/>
//
//</FrameLayout>


//fragment_2.xml
//<?xml version="1.0" encoding="utf-8"?>
//<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent">
//
//    <TextView
//        android:layout_width="match_parent"
//        android:layout_height="match_parent"
//        android:text="Hello from Fragment 2"
//        android:textSize="24sp"
//        android:gravity="center"
//        android:background="@android:color/holo_blue_light"/>
//
//</FrameLayout>

//output: two  buttons, when clicked respective fragment appears