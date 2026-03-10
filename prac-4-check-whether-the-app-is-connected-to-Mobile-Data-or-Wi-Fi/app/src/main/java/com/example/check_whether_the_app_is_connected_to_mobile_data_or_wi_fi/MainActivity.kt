package com.example.check_whether_the_app_is_connected_to_mobile_data_or_wi_fi

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class MainActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState);enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val manager=getSystemService(Context.CONNECTIVITY_SERVICE)
                as ConnectivityManager
        val networkInfo:NetworkInfo?=manager.activeNetworkInfo
        if(networkInfo!=null&&networkInfo.isConnectedOrConnecting){
            if(networkInfo.type==ConnectivityManager.TYPE_MOBILE){
                Toast.makeText(this,"You are Connected to Mobile Network",
                    Toast.LENGTH_LONG).show()}
            if(networkInfo.type==ConnectivityManager.TYPE_WIFI){
                Toast.makeText(this,"You are Connected to Wi-Fi",
                    Toast.LENGTH_LONG).show()}
        }else{
            Toast.makeText(this,"Offline",Toast.LENGTH_LONG).show()}
    }}














//app -> manifests -> AndroidManifests.xml : after <manifest> add this :
//<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
//<uses-permission android:name="android.permission.INTERNET"/>

//output - see a pop up as soon as you open the app
//
//(//if issue arises activitly_main ko new banao )