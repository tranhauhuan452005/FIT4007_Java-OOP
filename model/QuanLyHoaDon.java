package model;

import controller.HoaDon;

import java.util.ArrayList;
import java.util.List;

public class QuanLyHoaDon {
    private List<HoaDon> danhSachHoaDon;

    public QuanLyHoaDon() {
        danhSachHoaDon = new ArrayList<>();
    }

    public void ghiNhanHoaDon(HoaDon hoaDon) {
        danhSachHoaDon.add(hoaDon);
    }

    public void hienThiHoaDon() {
        System.out.println("Danh sách hóa đơn:");
        for (HoaDon hd : danhSachHoaDon) {
            System.out.println(hd.toString());
        }
    }
}