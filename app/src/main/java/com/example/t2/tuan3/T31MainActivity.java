package com.example.t2.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.t2.R;

import java.util.ArrayList;

public class T31MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Demo3Contact> ls= new ArrayList<>();
    Demo31Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t31_main);
        listView=findViewById(R.id.demo31Listview1);
        ls.add(new Demo3Contact("Nguyen van A","18",R.drawable.android));
        ls.add(new Demo3Contact("Nguyen van b","18",R.drawable.blogger));
        ls.add(new Demo3Contact("Nguyen van c","18",R.drawable.apple));
        ls.add(new Demo3Contact("Nguyen van d","18",R.drawable.hp));
        adapter=new Demo31Adapter(this, ls);
        listView.setAdapter(adapter);

    }
}