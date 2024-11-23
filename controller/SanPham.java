package controller;

import java.io.Serializable;

public class SanPham implements Serializable {
    private String maSP; // Không nên là biến tĩnh vì mỗi sản phẩm cần một mã duy nhất ( static )
    private String tenSP;
    private int soLuong;
    private double donGia;

    // Hàm getter và setter cho các thuộc tính
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    // Hàm tạo với logic để thêm tiền tố vào mã sản phẩm
    public SanPham(String maSP, String tenSP, int soLuong, double donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    // Phương thức toString để hiển thị thông tin sản phẩm
    @Override
    public String toString() {
        return "Mã sản phẩm: " + maSP + "\n" +
                "Tên sản phẩm: " + tenSP + "\n" +
                "Số lượng: " + soLuong + "\n" +
                "Đơn giá: " + donGia + "\n" +
                "--------------------\n";
    }
}
