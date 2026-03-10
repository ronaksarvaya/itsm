package com.example.request_audio_recording_permission

import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
class MainActivity:AppCompatActivity(){
    private val RECORD_AUDIO=1
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setPermission()}
    private fun setPermission(){
        val permission=ContextCompat.checkSelfPermission(this,
            android.Manifest.permission.RECORD_AUDIO)
        if(permission!=PackageManager.PERMISSION_GRANTED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(this,
                    android.Manifest.permission.RECORD_AUDIO)){
                val builder=AlertDialog.Builder(this)
                builder.setTitle("Permission Required")
                builder.setMessage("Permission required to record audio")
                builder.setPositiveButton("OK"){_,_->giveRequest()}
                builder.create().show()
            }else{giveRequest()}}}
    private fun giveRequest(){
        ActivityCompat.requestPermissions(this,
            arrayOf(android.Manifest.permission.RECORD_AUDIO),RECORD_AUDIO)}
    override fun onRequestPermissionsResult(requestCode:Int,
                                            permissions:Array<out String>,grantResults:IntArray){
        super.onRequestPermissionsResult(requestCode,permissions,grantResults)
        when(requestCode){
            RECORD_AUDIO->{
                if(grantResults.isEmpty()||
                    grantResults[0]!=PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this,"Permission Denied",
                        Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this,"Permission Granted",
                        Toast.LENGTH_SHORT).show()}}}}}







//app -> manifests -> AndroidManifests.xml : after <manifest> add this :
//<uses-permission android:name="android.permission.RECORD_AUDIO"/>

//output - Asks for recording permission , once allowed, a toast appears