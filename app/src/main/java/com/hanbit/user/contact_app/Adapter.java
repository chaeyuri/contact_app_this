package com.hanbit.user.contact_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 1027 on 2016-07-16.
 */
public class Adapter extends BaseAdapter {
    private static ArrayList<People> list;
    private LayoutInflater inflater;
    private int[] photos={
            R.drawable.cupcake,
            R.drawable.donut,
            R.drawable.eclair,
            R.drawable.froyo,
            R.drawable.gingerbread,
            R.drawable.honeycomb,
            R.drawable.icecream,
            R.drawable.jellybean,
            R.drawable.kitkat,
            R.drawable.lollipop
    };
    public Adapter(Context context, ArrayList<People>list) {
        this.list = list;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View v, ViewGroup parent) {
        ViewHolder holder = null;
        if (v == null) {
            v = inflater.inflate(R.layout.people,null);
            holder = new ViewHolder();
            holder.setName((TextView) v.findViewById(R.id.name));
            holder.setEmail((TextView) v.findViewById(R.id.email));
            holder.setPhoneNo((TextView) v.findViewById(R.id.phoneNo));
            holder.setPhoto((ImageView) v.findViewById(R.id.photo));
        } else {
            holder = (ViewHolder) v.getTag();
        }
        holder.getName().setText(list.get(i).getName());
        holder.getEmail().setText(list.get(i).getEmail());
        holder.getPhoneNo().setText(list.get(i).getPhoneNo());
        holder.getPhoto().setImageResource(photos[list.get(i).getPhoto()-1]);
        return v;
    }
}