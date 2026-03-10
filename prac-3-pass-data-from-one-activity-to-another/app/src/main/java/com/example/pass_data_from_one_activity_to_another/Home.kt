package com.example.pass_data_from_one_activity_to_another

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class Home:AppCompatActivity(){
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        val msg=intent.getStringExtra("msg")
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }}