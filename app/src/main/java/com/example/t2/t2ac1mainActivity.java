package com.example.t2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class t2ac1mainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t2ac1main);
        txt1=findViewById(R.id.demo2Ac1Txt1);
        txt2=findViewById(R.id.demo2Ac1Txt2);
        btn1=findViewById(R.id.demo2Ac1Btn1);
        btn1.setOnClickListener((v)->{
            Intent intent   =new Intent(t2ac1mainActivity.this,
                    t2ac2mainActivity.class);
            intent.putExtra("so1",txt1.getText().toString());
            intent.putExtra("so2",txt2.getText().toString());
            startActivity(intent);
        });
    }
}