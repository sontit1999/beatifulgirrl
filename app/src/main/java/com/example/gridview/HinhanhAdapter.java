package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class HinhanhAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<Hinhanh> listhinhanh;

    public HinhanhAdapter(Context context, int layout, List<Hinhanh> listhinhanh) {
        this.context = context;
        this.layout = layout;
        this.listhinhanh = listhinhanh;
    }

    @Override
    public int getCount() {
        return listhinhanh.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        Viewhoder hoder;
        if(convertView == null){
            hoder = new Viewhoder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            hoder.imgHinhanh = (ImageView) convertView.findViewById(R.id.imageHinhanh);
            convertView.setTag(hoder);
        }else{
            hoder = (Viewhoder) convertView.getTag();
        }

        // gán giá trị
        Hinhanh hinhanh = listhinhanh.get(position);
        hoder.imgHinhanh.setImageResource(hinhanh.getHinhanh());
        return convertView;
    }
}
