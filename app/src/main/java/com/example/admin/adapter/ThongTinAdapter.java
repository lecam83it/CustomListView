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
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.danhba.R;
import com.example.admin.model.ThongTin;

import java.util.List;

/**
 * Created by Admin on 8/3/2017.
 */

public class ThongTinAdapter extends BaseAdapter {

    class ViewHolder{
        TextView txtName;
        ImageView imgAvatar;
        public ViewHolder(){}
    }
    @NonNull
    Activity context;
    @LayoutRes int resource;
    @NonNull List<ThongTin> objects;
    public ThongTinAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List<ThongTin> objects) {
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null){
            holder = new ViewHolder();
            convertView = this.context.getLayoutInflater().inflate(this.resource, null);

            holder.txtName = (TextView) convertView.findViewById(R.id.txtName);
            holder.imgAvatar = (ImageView) convertView.findViewById(R.id.imgAvatar);

            convertView.setTag(holder);
        } else {
           holder = (ViewHolder) convertView.getTag();
        }
        ThongTin thongTin = (ThongTin) getItem(position);
        holder.imgAvatar.setImageResource(thongTin.getMaHinhAnh());
        holder.txtName.setText(thongTin.getName());
        return  convertView;
    }
}
