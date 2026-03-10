package com.example.user_login

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //    private lateinit var appBarConfiguration: AppBarConfiguration
//    private lateinit var binding: ActivityMainBinding
    lateinit var edittext1:EditText
    lateinit var edittext2:EditText
    lateinit var login:Button
    lateinit var signup:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"hello",Toast.LENGTH_LONG).show()
        edittext1=findViewById(R.id.user)
        edittext2=findViewById(R.id.pass)
        login=findViewById(R.id.btn)
        signup=findViewById(R.id.btn1)
        login.setOnClickListener {

            if(edittext1.text.toString().equals (edittext2.text.toString())){
                Toast.makeText(this,"login success",Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"login fail",Toast.LENGTH_LONG).show()
            }

        }
        signup.setOnClickListener {
            Toast.makeText(this,"signup click",Toast.LENGTH_LONG).show()




        }

    }
}