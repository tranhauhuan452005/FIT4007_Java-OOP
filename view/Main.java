package view;

import controller.NhanVien;
import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySanPham quanLySanPham = new QuanLySanPham();
        QuanLyDoanhThu quanLyDoanhThu = new QuanLyDoanhThu();
        QuanLyHoaDon quanLyHoaDon = new QuanLyHoaDon();
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        Scanner scanner = new Scanner(System.in);

        int luaChon = -1;

        do {
            System.out.println("-------------------------------------------------------------");
            System.out.println("|" + "\t\t\t\t\t\tManagement APP" + "\t\t\t\t\t\t|");
            System.out.println("|" + "\t\t1. Thêm sản phẩm" + "\t\t\t\t\t\t\t\t\t|");
            System.out.println("|" + "\t\t2. Hiển thị danh sách sản phẩm" + "\t\t\t\t\t\t|");
            System.out.println("|" + "\t\t3. Tìm kiếm sản phẩm theo mã" + "\t\t\t\t\t\t|");
            System.out.println("|" + "\t\t4. Xóa sản phẩm theo mã" + "\t\t\t\t\t\t\t\t|");
            System.out.println("|" + "\t\t5. Sửa thông tin sản phẩm" + "\t\t\t\t\t\t\t|");
            System.out.println("|" + "\t\t6. Lưu sản phẩm vào file" + "\t\t\t\t\t\t\t|");
            System.out.println("|" + "\t\t7. Đọc danh sách sản phẩm từ file" + "\t\t\t\t\t|");
            System.out.println("|" + "\t\t8. Bán sản phẩm" + "\t\t\t\t\t\t\t\t\t\t|");
            System.out.println("|" + "\t\t9. Hiển thị hóa đơn" + "\t\t\t\t\t\t\t\t\t|");
            System.out.println("|" + "\t\t10. Hiển thị doanh thu" + "\t\t\t\t\t\t\t\t|");
            System.out.println("|" + "\t\t11. Quản lý nhân viên" + "\t\t\t\t\t\t\t\t|");
            System.out.println("|" + "\t\t0. Thoát chương trình" + "\t\t\t\t\t\t\t\t|");
            System.out.println("-------------------------------------------------------------");

            try {
                System.out.print("> > Nhập lựa chọn của bạn: ");
                luaChon = Integer.parseInt(scanner.nextLine());

                if (luaChon < 0 || luaChon > 11) {
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập số từ 0 đến 11.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ.");
                luaChon = -1; // Đặt lại giá trị để vòng lặp tiếp tục
            }

            switch (luaChon) {
                case 1:
                    quanLySanPham.themSanPham();
                    break;
                case 2:
                    quanLySanPham.hienThiSanPham();
                    break;
                case 3:
                    quanLySanPham.timKiemSanPham();
                    break;
                case 4:
                    quanLySanPham.xoaSanPham();
                    break;
                case 5:
                    quanLySanPham.suaSanPham();
                    break;
                case 6:
                    quanLySanPham.luuFile();
                    break;
                case 7:
                    quanLySanPham.docFile();
                    break;
                case 8:
                    quanLySanPham.banHang();
                    break;
                case 9:
                    quanLyHoaDon.hienThiHoaDon();
                    break;
                case 10:
                    quanLyDoanhThu.hienThiDoanhThu();
                    break;
                case 11:
                    quanLyNhanVienMenu(quanLyNhanVien, scanner);
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            } // Lệnh sử dụng các lựa chọn trong app
        } while (luaChon != 0);

        scanner.close();
    }

    private static void quanLyNhanVienMenu(QuanLyNhanVien quanLyNhanVien, Scanner scanner) {
        int luaChonNhanVien = -1;

        do {
            System.out.println("\n=== MENU QUẢN LÝ NHÂN VIÊN ===");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xóa nhân viên");
            System.out.println("3. Hiển thị danh sách nhân viên");
            System.out.println("4. Tìm kiếm nhân viên theo mã");
            System.out.println("5. Cập nhật thông tin nhân viên");
            System.out.println("0. Quay lại menu chính");
            System.out.print("Nhập lựa chọn: ");

            try {
                luaChonNhanVien = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ.");
                luaChonNhanVien = -1;
                continue;
            }

            switch (luaChonNhanVien) {
                case 1:
                    System.out.print("Nhập mã nhân viên: ");
                    String maNhanVien = scanner.nextLine();
                    System.out.print("Nhập họ tên: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int tuoi = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập chức vụ: ");
                    String chucVu = scanner.nextLine();
                    System.out.print("Nhập lương cơ bản: ");
                    double luongCoBan = Double.parseDouble(scanner.nextLine());
                    System.out.print("Nhập doanh số bán hàng: ");
                    double doanhSo = Double.parseDouble(scanner.nextLine());

                    NhanVien nv = new NhanVien(maNhanVien, hoTen, tuoi, chucVu, luongCoBan, doanhSo);
                    quanLyNhanVien.themNhanVien(nv);
                    break;

                case 2:
                    System.out.print("Nhập mã nhân viên cần xóa: ");
                    String maXoa = scanner.nextLine();
                    quanLyNhanVien.xoaNhanVien(maXoa);
                    break;

                case 3:
                    quanLyNhanVien.hienThiDanhSachNhanVien();
                    break;

                case 4:
                    System.out.print("Nhập mã nhân viên cần tìm: ");
                    String maTim = scanner.nextLine();
                    NhanVien nvTim = quanLyNhanVien.timKiemNhanVien(maTim);
                    if (nvTim != null) {
                        nvTim.hienThiThongTin();
                    } else {
                        System.out.println("Không tìm thấy nhân viên.");
                    }
                    break;

                case 5:
                    System.out.print("Nhập mã nhân viên cần cập nhật: ");
                    String maCapNhat = scanner.nextLine();
                    System.out.print("Nhập họ tên mới: ");
                    String hoTenMoi = scanner.nextLine();
                    System.out.print("Nhập tuổi mới: ");
                    int tuoiMoi = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập chức vụ mới: ");
                    String chucVuMoi = scanner.nextLine();
                    System.out.print("Nhập lương cơ bản mới: ");
                    double luongMoi = Double.parseDouble(scanner.nextLine());
                    System.out.print("Nhập doanh số mới: ");
                    double doanhSoMoi = Double.parseDouble(scanner.nextLine());

                    quanLyNhanVien.capNhatThongTinNhanVien(maCapNhat, hoTenMoi, tuoiMoi, chucVuMoi, luongMoi, doanhSoMoi);
                    break;
                case 0:
                    System.out.println("Quay lại menu chính.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (luaChonNhanVien != 0); // lệnh sử dụng chức năng nhân viên
    }
}
