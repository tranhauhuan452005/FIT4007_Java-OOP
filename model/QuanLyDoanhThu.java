package model;

import java.util.HashMap;

public class QuanLyDoanhThu {
    private HashMap<String, Double> doanhThuTheoNgay;

    public QuanLyDoanhThu() {
        doanhThuTheoNgay = new HashMap<>();
    }

    public void ghiNhanDoanhThu(String ngay, double soTien) {
        doanhThuTheoNgay.put(ngay, doanhThuTheoNgay.getOrDefault(ngay, 0.0) + soTien);
    }
    public void hienThiDoanhThu() {
        System.out.println("Doanh thu theo ngày:");
        for (String ngay : doanhThuTheoNgay.keySet()) {
            System.out.println("Ngày: " + ngay + " - Doanh thu: " + doanhThuTheoNgay.get(ngay));
        }
    }

}