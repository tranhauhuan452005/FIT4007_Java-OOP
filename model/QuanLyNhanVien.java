package model;

import controller.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien {
    private List<NhanVien> danhSachNhanVien;

    public QuanLyNhanVien() {
        this.danhSachNhanVien = new ArrayList<>();
    }

    public void themNhanVien(NhanVien nv) {
        danhSachNhanVien.add(nv);
        System.out.println("Thêm nhân viên thành công.");
    }

    public void xoaNhanVien(String maNhanVien) {
        NhanVien nv = timKiemNhanVien(maNhanVien);
        if (nv != null) {
            danhSachNhanVien.remove(nv);
            System.out.println("Xóa nhân viên thành công.");
        } else {
            System.out.println("Không tìm thấy nhân viên với mã: " + maNhanVien);
        }
    }

    public void capNhatThongTinNhanVien(String maNhanVien, String hoTen, int tuoi, String chucVu, double luongCoBan, double doanhSo) {
        NhanVien nv = timKiemNhanVien(maNhanVien);
        if (nv != null) {
            nv.setHoTen(hoTen);
            nv.setTuoi(tuoi);
            nv.setChucVu(chucVu);
            nv.setLuongCoBan(luongCoBan);
            nv.setDoanhSo(doanhSo);
            System.out.println("Cập nhật thông tin nhân viên thành công.");
        } else {
            System.out.println("Không tìm thấy nhân viên với mã: " + maNhanVien);
        }
    }

    public NhanVien timKiemNhanVien(String maNhanVien) {
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getMaNhanVien().equals(maNhanVien)) {
                return nv;
            }
        }
        return null;
    }

    public void hienThiDanhSachNhanVien() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
        } else {
            System.out.println("Danh sách nhân viên:");
            for (NhanVien nv : danhSachNhanVien) {
                nv.hienThiThongTin();
            }
        }
    }
}