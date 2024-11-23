package controller;

public class NhanVien {
    private String maNhanVien;
    private String hoTen;
    private int tuoi;
    private String chucVu;
    private double luongCoBan;
    private double doanhSo;

    public NhanVien(String maNhanVien, String hoTen, int tuoi, String chucVu, double luongCoBan, double doanhSo) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.doanhSo = doanhSo;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double tinhLuongThucNhan() {
        double hoaHong = doanhSo * 0.05; // Hoa hồng 5% doanh số
        return luongCoBan + hoaHong;
    }

    public void hienThiThongTin() {
        System.out.printf(
                "Mã NV: %s, Họ Tên: %s, Tuổi: %d, Chức Vụ: %s, Lương Cơ Bản: %.2f, Doanh Số: %.2f, Lương Thực Nhận: %.2f\n",
                maNhanVien, hoTen, tuoi, chucVu, luongCoBan, doanhSo, tinhLuongThucNhan());
    }
}