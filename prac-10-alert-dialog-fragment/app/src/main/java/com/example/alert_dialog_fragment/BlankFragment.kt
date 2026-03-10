package com.example.alert_dialog_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val rootview = inflater.inflate(R.layout.fragment_blank, container, false)

        val loginbtn = rootview.findViewById<Button>(R.id.login)
        val user = rootview.findViewById<EditText>(R.id.edtname)
        val password = rootview.findViewById<EditText>(R.id.edtpass)
        val cancel = rootview.findViewById<Button>(R.id.cancel)
        val message = rootview.findViewById<TextView>(R.id.msg)

        loginbtn.setOnClickListener {
            message.text = "Hello " + user.text.toString()
        }

        cancel.setOnClickListener {
            parentFragmentManager.beginTransaction().remove(this).commit()
        }

        return rootview
    }
}