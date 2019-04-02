package com.example.gridview;

import android.widget.ImageView;

public class Hinhanh {
    private String Tenhinh;
    private int Hinhanh;

    public Hinhanh(String tenhinh, int hinhanh) {
        Tenhinh = tenhinh;
        Hinhanh = hinhanh;
    }

    public String getTenhinh() {
        return Tenhinh;
    }

    public void setTenhinh(String tenhinh) {
        Tenhinh = tenhinh;
    }

    public int getHinhanh() {
        return Hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        Hinhanh = hinhanh;
    }
}
