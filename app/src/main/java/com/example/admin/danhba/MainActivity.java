package com.example.admin.danhba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.admin.adapter.ThongTinAdapter;
import com.example.admin.model.ThongTin;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ThongTin> danhSach;
    ThongTinAdapter adapter;
    ListView lvDanhSach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setControl();

    }

    private void setControl() {

        danhSach = new ArrayList<>();
        danhSach.add(new ThongTin("Lê Cẩm", R.drawable.anh2));
        danhSach.add(new ThongTin("Lê Văn Minh", R.drawable.anh1));

        adapter = new ThongTinAdapter(MainActivity.this, R.layout.layout_item, danhSach);
        lvDanhSach = (ListView) findViewById(R.id.lvDanhSach);
        lvDanhSach.setAdapter(adapter);

    }
}
