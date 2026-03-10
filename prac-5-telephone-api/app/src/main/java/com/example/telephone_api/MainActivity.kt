package com.example.telephone_api

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

class MainActivity:AppCompatActivity(){
    private val REQUEST_CODE=1
    lateinit var btn:Button
    lateinit var edt:EditText
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn=findViewById(R.id.btn);edt=findViewById(R.id.input)
        btn.setOnClickListener{
            if(ActivityCompat.checkSelfPermission(this,
                    Manifest.permission.CALL_PHONE)!=PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(this,
                    arrayOf(Manifest.permission.CALL_PHONE),REQUEST_CODE)
            }else{makeCall()}}}
    private fun makeCall(){
        val number=edt.text.toString()
        val intent=Intent(Intent.ACTION_CALL)
        intent.data=Uri.parse("tel:$number")
        startActivity(intent)
    }}












//app -> manifests -> AndroidManifests.xml : after <manifest> add this :
//<uses-permission android:name="android.permission.CALL_PHONE" tools:ignore="PermissionImpliesUnsupportedChromeOsHardware"/>
//
// output - enter your number and submit and you will be redirected to a call