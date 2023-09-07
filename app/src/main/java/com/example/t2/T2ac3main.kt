package com.example.t2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class T2ac3main : AppCompatActivity() {
    var txt1: EditText?=null
    var btn1: Button? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t2ac3main)
        var txt2 =findViewById<EditText>(R.id.demo2Ac3Txt2)
        txt1=findViewById(R.id.demo2Ac3Txt1)
        btn1=findViewById(R.id.demo2Ac3Btn1)
        btn1?.setOnClickListener{
            val intent = Intent(this@T2ac3main,
                T2ac4main::class.java)
            intent.putExtra("so1",txt1?.text.toString())
            intent.putExtra("so2",txt2?.text.toString())
            startActivity(intent)

        }
    }
}