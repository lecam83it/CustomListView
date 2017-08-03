package com.example.admin.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.danhba.R;
import com.example.admin.model.ThongTin;

import java.util.List;

/**
 * Created by Admin on 8/3/2017.
 */

public class ThongTinAdapter extends ArrayAdapter<ThongTin> {

    class ViewHolder{
        TextView txtTen;
        ImageView imgHinhAnh;
        public ViewHolder(){}
    }
    @NonNull
    Activity context;
    @LayoutRes int resource;
    @NonNull List<ThongTin> objects;
    public ThongTinAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List<ThongTin> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null){
            holder = new ViewHolder();
            convertView = this.context.getLayoutInflater().inflate(this.resource, null);

            holder.txtTen = (TextView) convertView.findViewById(R.id.txtTen);
            holder.imgHinhAnh = (ImageView) convertView.findViewById(R.id.imgHinhAnh);

            convertView.setTag(holder);
        } else {
           holder = (ViewHolder) convertView.getTag();
        }
        ThongTin thongTin = getItem(position);
        holder.imgHinhAnh.setImageResource(thongTin.getMaHinhAnh());
        holder.txtTen.setText(thongTin.getName());
        return  convertView;
    }
}
