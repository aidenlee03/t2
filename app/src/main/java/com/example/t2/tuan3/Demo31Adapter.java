package com.example.t2.tuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import com.example.t2.R;

import java.util.ArrayList;

public class Demo31Adapter extends BaseAdapter {
    private Context context;
    ArrayList<Demo3Contact> ls;
    //khởi tạo
    public Demo31Adapter(Context context, ArrayList<Demo3Contact> ls){
        this.context=context;
        this.ls=ls;
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
        //1--Tao layou
        ViewAnhxa vax;
        if(view==null)//neu chua co view thi tao view moi
        {
            vax=new ViewAnhxa();
            //anh xa lay out vao code java
            view= LayoutInflater.from(context).inflate(R.layout.demo31_itemview,null);
            //anh xa tung thanh phan cua layout
            vax.img_hinh=view.findViewById(R.id.demo31_item_hinh);
            vax.tv_ten=view.findViewById(R.id.demo31_item_ten);
            vax.tv_tuoi=view.findViewById(R.id.demo31_item_tuoi);
            //tao template de lan sau su dung
            view.setTag(vax);
        }else//neu da ton tai tu truoc thi lay ra su dung
        {
            vax=(ViewAnhxa) view.getTag();
        }
        vax.img_hinh.setImageResource(ls.get(i).getHinh());
        vax.tv_ten.setText(ls.get(i).getTen());
        vax.tv_tuoi.setText((ls.get(i).getTuoi()));
        return view;
    }
    public class ViewAnhxa{
        public ImageView img_hinh;
        public TextView tv_ten;
        public TextView tv_tuoi;
    }
}
