package com.example.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView gvhinh;
    List<Hinhanh> listHinh;
    HinhanhAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        adapter = new HinhanhAdapter(MainActivity.this,R.layout.dong_hinhanh,listHinh);
        gvhinh.setAdapter(adapter);
    }

    private void anhxa() {
        gvhinh = (GridView) findViewById(R.id.gridviewhinhanh);
        listHinh = new ArrayList<>();
        listHinh.add(new Hinhanh("Cô gái số 1",R.drawable.girl1));
        listHinh.add(new Hinhanh("Cô gái số 2",R.drawable.girl2));
        listHinh.add(new Hinhanh("Cô gái số 3",R.drawable.girl3));
        listHinh.add(new Hinhanh("Cô gái số 4",R.drawable.girl4));
        listHinh.add(new Hinhanh("Cô gái số 5",R.drawable.girl5));
        listHinh.add(new Hinhanh("Cô gái số 6",R.drawable.girl6));
        listHinh.add(new Hinhanh("Cô gái số 7",R.drawable.girl7));
        listHinh.add(new Hinhanh("Cô gái số 8",R.drawable.girl8));
        listHinh.add(new Hinhanh("Cô gái số 9",R.drawable.girl9));
        listHinh.add(new Hinhanh("Cô gái số 10",R.drawable.girl10));
        listHinh.add(new Hinhanh("Cô gái số 1",R.drawable.girl1));
        listHinh.add(new Hinhanh("Cô gái số 2",R.drawable.girl2));
        listHinh.add(new Hinhanh("Cô gái số 3",R.drawable.girl3));
        listHinh.add(new Hinhanh("Cô gái số 4",R.drawable.girl4));
        listHinh.add(new Hinhanh("Cô gái số 5",R.drawable.girl5));
        listHinh.add(new Hinhanh("Cô gái số 6",R.drawable.girl6));
        listHinh.add(new Hinhanh("Cô gái số 7",R.drawable.girl7));
        listHinh.add(new Hinhanh("Cô gái số 8",R.drawable.girl8));
        listHinh.add(new Hinhanh("Cô gái số 9",R.drawable.girl9));
        listHinh.add(new Hinhanh("Cô gái số 10",R.drawable.girl10));
        listHinh.add(new Hinhanh("Cô gái số 1",R.drawable.girl1));
        listHinh.add(new Hinhanh("Cô gái số 2",R.drawable.girl2));
        listHinh.add(new Hinhanh("Cô gái số 3",R.drawable.girl3));
        listHinh.add(new Hinhanh("Cô gái số 4",R.drawable.girl4));
        listHinh.add(new Hinhanh("Cô gái số 5",R.drawable.girl5));
        listHinh.add(new Hinhanh("Cô gái số 6",R.drawable.girl6));
        listHinh.add(new Hinhanh("Cô gái số 7",R.drawable.girl7));
        listHinh.add(new Hinhanh("Cô gái số 8",R.drawable.girl8));
        listHinh.add(new Hinhanh("Cô gái số 9",R.drawable.girl9));
        listHinh.add(new Hinhanh("Cô gái số 10",R.drawable.girl10));
        listHinh.add(new Hinhanh("Cô gái số 1",R.drawable.girl1));
        listHinh.add(new Hinhanh("Cô gái số 2",R.drawable.girl2));
        listHinh.add(new Hinhanh("Cô gái số 3",R.drawable.girl3));
        listHinh.add(new Hinhanh("Cô gái số 4",R.drawable.girl4));
        listHinh.add(new Hinhanh("Cô gái số 5",R.drawable.girl5));
        listHinh.add(new Hinhanh("Cô gái số 6",R.drawable.girl6));
        listHinh.add(new Hinhanh("Cô gái số 7",R.drawable.girl7));
        listHinh.add(new Hinhanh("Cô gái số 8",R.drawable.girl8));
        listHinh.add(new Hinhanh("Cô gái số 9",R.drawable.girl9));
        listHinh.add(new Hinhanh("Cô gái số 10",R.drawable.girl10));
        listHinh.add(new Hinhanh("Cô gái số 1",R.drawable.girl1));
        listHinh.add(new Hinhanh("Cô gái số 2",R.drawable.girl2));
        listHinh.add(new Hinhanh("Cô gái số 3",R.drawable.girl3));
        listHinh.add(new Hinhanh("Cô gái số 4",R.drawable.girl4));
        listHinh.add(new Hinhanh("Cô gái số 5",R.drawable.girl5));
        listHinh.add(new Hinhanh("Cô gái số 6",R.drawable.girl6));
        listHinh.add(new Hinhanh("Cô gái số 7",R.drawable.girl7));
        listHinh.add(new Hinhanh("Cô gái số 8",R.drawable.girl8));
        listHinh.add(new Hinhanh("Cô gái số 9",R.drawable.girl9));
        listHinh.add(new Hinhanh("Cô gái số 10",R.drawable.girl10));
        listHinh.add(new Hinhanh("Cô gái số 1",R.drawable.girl1));
        listHinh.add(new Hinhanh("Cô gái số 2",R.drawable.girl2));
        listHinh.add(new Hinhanh("Cô gái số 3",R.drawable.girl3));
        listHinh.add(new Hinhanh("Cô gái số 4",R.drawable.girl4));
        listHinh.add(new Hinhanh("Cô gái số 5",R.drawable.girl5));
        listHinh.add(new Hinhanh("Cô gái số 6",R.drawable.girl6));
        listHinh.add(new Hinhanh("Cô gái số 7",R.drawable.girl7));
        listHinh.add(new Hinhanh("Cô gái số 8",R.drawable.girl8));
        listHinh.add(new Hinhanh("Cô gái số 9",R.drawable.girl9));
        listHinh.add(new Hinhanh("Cô gái số 10",R.drawable.girl10));
        listHinh.add(new Hinhanh("Cô gái số 1",R.drawable.girl1));
        listHinh.add(new Hinhanh("Cô gái số 2",R.drawable.girl2));
        listHinh.add(new Hinhanh("Cô gái số 3",R.drawable.girl3));
        listHinh.add(new Hinhanh("Cô gái số 4",R.drawable.girl4));
        listHinh.add(new Hinhanh("Cô gái số 5",R.drawable.girl5));
        listHinh.add(new Hinhanh("Cô gái số 6",R.drawable.girl6));
        listHinh.add(new Hinhanh("Cô gái số 7",R.drawable.girl7));
        listHinh.add(new Hinhanh("Cô gái số 8",R.drawable.girl8));
        listHinh.add(new Hinhanh("Cô gái số 9",R.drawable.girl9));
        listHinh.add(new Hinhanh("Cô gái số 10",R.drawable.girl10));
        listHinh.add(new Hinhanh("Cô gái số 1",R.drawable.girl1));
        listHinh.add(new Hinhanh("Cô gái số 2",R.drawable.girl2));
        listHinh.add(new Hinhanh("Cô gái số 3",R.drawable.girl3));
        listHinh.add(new Hinhanh("Cô gái số 4",R.drawable.girl4));
        listHinh.add(new Hinhanh("Cô gái số 5",R.drawable.girl5));
        listHinh.add(new Hinhanh("Cô gái số 6",R.drawable.girl6));
        listHinh.add(new Hinhanh("Cô gái số 7",R.drawable.girl7));
        listHinh.add(new Hinhanh("Cô gái số 8",R.drawable.girl8));
        listHinh.add(new Hinhanh("Cô gái số 9",R.drawable.girl9));
        listHinh.add(new Hinhanh("Cô gái số 10",R.drawable.girl10));
        listHinh.add(new Hinhanh("Cô gái số 1",R.drawable.girl1));
        listHinh.add(new Hinhanh("Cô gái số 2",R.drawable.girl2));
        listHinh.add(new Hinhanh("Cô gái số 3",R.drawable.girl3));
        listHinh.add(new Hinhanh("Cô gái số 4",R.drawable.girl4));
        listHinh.add(new Hinhanh("Cô gái số 5",R.drawable.girl5));
        listHinh.add(new Hinhanh("Cô gái số 6",R.drawable.girl6));
        listHinh.add(new Hinhanh("Cô gái số 7",R.drawable.girl7));
        listHinh.add(new Hinhanh("Cô gái số 8",R.drawable.girl8));
        listHinh.add(new Hinhanh("Cô gái số 9",R.drawable.girl9));
        listHinh.add(new Hinhanh("Cô gái số 10",R.drawable.girl10));

    }
}
