package com.example.admin.model;

import java.io.Serializable;

/**
 * Created by Admin on 8/3/2017.
 */

public class ThongTin implements Serializable{
    private String name;
    private int maAvatar;

    public ThongTin() {
    }

    public ThongTin(String name, int maHinhAnh) {
        this.name = name;
        this.maAvatar = maHinhAnh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaHinhAnh() {
        return maAvatar;
    }

    public void setMaHinhAnh(int maHinhAnh) {
        this.maAvatar = maHinhAnh;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
