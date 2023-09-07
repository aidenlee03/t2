package com.example.t2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class t2ac2mainActivity extends AppCompatActivity {
TextView tvKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t2ac2main);
        tvKQ=findViewById(R.id.demo2Ac2Tv1);
        Intent intent1=getIntent();
        String chuoi1=intent1.getExtras().getString("so1");
        String chuoi2=intent1.getExtras().getString("so2");
        float so1=Float.parseFloat(chuoi1);
        float so2=Float.parseFloat(chuoi2);
        float tong=so1+so2;
        tvKQ.setText(String.valueOf(tong));
    }
}