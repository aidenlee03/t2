package com.example.t2.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.t2.R;

import java.util.ArrayList;



public class Demo32Activity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Demo32Model> ls= new ArrayList<>();
    demo32Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo32);
        gridView=findViewById(R.id.demo32Gridview);
        ls.add(new Demo32Model(R.drawable.apple));
        ls.add(new Demo32Model(R.drawable.dell));
        ls.add(new Demo32Model(R.drawable.android));
        ls.add(new Demo32Model(R.drawable.hp));
        adapter=new demo32Adapter(ls,this);
        gridView.setAdapter(adapter);

    }
}