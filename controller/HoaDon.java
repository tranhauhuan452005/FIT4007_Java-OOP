package controller;

public class HoaDon {
    private String maSP;
    private String tenSP;
    private double donGia;
    private int soLuong;
    private String ngayBan;

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

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public HoaDon(String maSP, String tenSP, double donGia, int soLuong, String ngayBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.ngayBan = ngayBan;
    }
    @Override
    public String toString() {
        return "Mã SP: " + maSP + ", Tên SP: " + tenSP + ", Đơn giá: " + donGia + ", Số lượng: " + soLuong + ", Ngày bán: " + ngayBan;
    }
}