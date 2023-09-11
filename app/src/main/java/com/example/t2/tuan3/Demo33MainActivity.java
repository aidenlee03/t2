package com.example.t2.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.t2.R;

public class Demo33MainActivity extends AppCompatActivity {
    Spinner spinner;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo33_main);
        spinner=findViewById(R.id.demo33Spinner);
        String[] ls={"item1","item2","item3","item4"};
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,ls);
        spinner.setAdapter(adapter);
    }
}