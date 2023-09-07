package com.example.t2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class T2ac4main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t2ac4main)
        //ánh xạ
        // var listView : ListView=findViewById(R.id.demo2Ac4Txt1)
        var lv=findViewById<ListView>(R.id.demo2Ac4Txt1);
        //nguon du lieu
        var arr= ArrayList<String>()
        arr.add("Thanh phan 1")
        arr.add("Thanh phan 2")
        arr.add("Thanh phan 3")
        arr.add("Thanh phan 4")
        //tạo adapter
        var ad : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        lv.adapter=ad
    }
}