package com.example.pass_data_from_one_activity_to_another

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity:AppCompatActivity(){
    lateinit var editText:EditText
    lateinit var button:Button
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState);enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        editText=findViewById(R.id.edit);button=findViewById(R.id.btn)
        button.setOnClickListener{
            val intent=Intent(this,Home::class.java)
            intent.putExtra("msg",editText.text.toString())
            startActivity(intent)
        }}}




















//Step 3: Now create a Home.kt file .
//app -> kotlin+java -> com.example -> (your current prac) -> right click -> new -> kotlin class file -> write Home -> click file
//
//Home.kt
//
//
//import android.os.Bundle
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//class Home:AppCompatActivity(){
//    override fun onCreate(savedInstanceState:Bundle?){
//        super.onCreate(savedInstanceState)
//        val msg=intent.getStringExtra("msg")
//        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
//    }}
//
//Step4: app -> manifests -> AndroidManifest.xml -> inside <application> -> after </activity> -> paste this ->
//
// <activity android:name=".Home"/>
//
//
// output - write your name and submit , same name pops up