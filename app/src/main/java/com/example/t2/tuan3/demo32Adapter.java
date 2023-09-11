package com.example.t2.tuan3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.ImageView;

import com.example.t2.R;

import java.util.ArrayList;

public class demo32Adapter extends BaseAdapter {
    private ArrayList<Demo32Model> ls;
    private Context context;

    public demo32Adapter(ArrayList<Demo32Model> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }

    @Override
    public int getCount() {
        return ls.size();
    }

    @Override
    public Object getItem(int i) {
        return ls.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //1.Tạo view
        ViewAx1 vax;
        if(view==null){
            vax=new ViewAx1();
            view= LayoutInflater.from(context).inflate(R.layout.demo32_itemview,null);
            vax.img_hinh=view.findViewById(R.id.demo32_item_hinh);
            view.setTag(vax);
        }else{
            vax=(ViewAx1) view.getTag();
        }
        //3.Gán dữ liệu
        vax.img_hinh.setImageResource(ls.get(i).getHinh());
        return view;
    }
    class ViewAx1{
        ImageView img_hinh;
    }
}
