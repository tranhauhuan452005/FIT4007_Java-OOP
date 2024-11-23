package model;

import controller.HoaDon;
import controller.SanPham;

import java.io.*; // Nhập các thư viện để làm việc với file
import java.util.ArrayList; // Nhập lớp ArrayList để sử dụng danh sách động
import java.util.HashMap;
import java.util.List; // Nhập lớp List để tạo danh sách
import java.util.Scanner; // Nhập lớp Scanner để nhập dữ liệu từ người dùng
import java.text.SimpleDateFormat;
import java.util.Date;

// Lớp BTL.QuanLySanPham để quản lý danh sách các sản phẩm
public class QuanLySanPham {
    private List<SanPham> danhSachSP; // Tạo 1 danh sách sản phẩm để lưu trữ tạm thời các sản phẩm
    private Scanner scanner; // Đối tượng Scanner để nhập dữ liệu từ người dùng
    private QuanLyDoanhThu quanLyDoanhThu;
    private QuanLyHoaDon quanLyHoaDon;
    private static int nextMaSP = 1;

    // Constructor của lớp, khởi tạo danh sách sản phẩm và scanner
    public QuanLySanPham() {
        this.danhSachSP = new ArrayList<>(); // Khởi tạo danh sách sản phẩm (ArrayList)
        this.scanner = new Scanner(System.in); // Khởi tạo Scanner để nhập dữ liệu
        this.quanLyDoanhThu = new QuanLyDoanhThu();
        this.quanLyHoaDon = new QuanLyHoaDon();
    }

    // Phương thức thêm sản phẩm vào danh sách
    public void themSanPham() {
        // Nhập thông tin sản phẩm
        System.out.print("Nhập mã sản phẩm: ");
        String maSP = scanner.nextLine();
        String MaSP = String.format("M%04d",nextMaSP++);
        System.out.print("Nhập tên sản phẩm: ");
        String tenSP = scanner.nextLine();
        int soLuong = -1;
        while (soLuong <= 0) {
            try {
                System.out.print("Nhập số lượng (số nguyên dương): ");
                soLuong = Integer.parseInt(scanner.nextLine());
                if (soLuong <= 0) {
                    System.out.println("Lỗi: Số lượng phải lớn hơn 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ.");
            }
        }
        double donGia = -1;
        while (donGia <= 0) {
            try {
                System.out.print("Nhập đơn giá (số dương): ");
                donGia = Double.parseDouble(scanner.nextLine());
                if (donGia <= 0) {
                    System.out.println("Lỗi: Đơn giá phải lớn hơn 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số hợp lệ.");
            }
        }
        // Thêm sản phẩm mới vào danh sách sản phẩm
        danhSachSP.add(new SanPham(maSP, tenSP, soLuong, donGia));
        System.out.println(">> Đã thêm thành công sản phẩm vào danh sách.");

    }



    // Phương thức hiển thị danh sách sản phẩm
    public void hienThiSanPham() {
        if (danhSachSP.isEmpty()) {
            // Nếu danh sách sản phẩm rỗng, thông báo không có sản phẩm
            System.out.println("Danh sách sản phẩm rỗng!");
            return;
        }
        HashMap<String, List<SanPham>> danhMucSanPham = new HashMap<>();
        // Hiển thị tiêu đề và định dạng bảng
        System.out.println("\t\t\t\t\t\tDanh Sách");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %-10s | %-10s |%n", "Mã SP", "Tên SP", "Số Lượng", "Đơn Giá");
        System.out.println("---------------------------------------------------------------");
        for (SanPham sp : danhSachSP) {
            System.out.printf("| %-10s | %-20s | %-10d | %-10.2f |%n", sp.getMaSP(), sp.getTenSP(), sp.getSoLuong(), sp.getDonGia());
        }

    }

    // Phương thức tìm kiếm sản phẩm theo mã
    public void timKiemSanPham() {
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        String maSP = scanner.nextLine(); // Nhập mã sản phẩm cần tìm
        SanPham sp = timKiemSanPhamTheoMa(maSP);
        if (maSP != null) {
            // Nếu tìm thấy, hiển thị thông tin sản phẩm
            System.out.println("Sản phẩm tìm thấy là: " + sp.getTenSP());
            System.out.println("Mã sản phẩm : " + sp.getMaSP());
            System.out.println("Tên sản phẩm: " + sp.getTenSP());
            System.out.println("Số lượng: " + sp.getSoLuong());
            System.out.println("Đơn giá: " + sp.getDonGia());
        } else {
            // Nếu không tìm thấy, thông báo
            System.out.println("Không tìm thấy sản phẩm với mã: " + maSP);
        }
    }

    // Phương thức tìm kiếm sản phẩm theo mã (trả về đối tượng sản phẩm hoặc null nếu không tìm thấy)
    private SanPham timKiemSanPhamTheoMa(String maSP) {

        for (SanPham sp : danhSachSP) {
            if (sp.getMaSP().equals(maSP)) {
                return sp; // Trả về sản phẩm nếu tìm thấy
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }

    // Phương thức xóa sản phẩm theo mã
    public void xoaSanPham() {
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        String maSP = scanner.nextLine(); // Nhập mã sản phẩm cần xóa
        boolean removed = danhSachSP.removeIf(sp -> sp.getMaSP().equals(maSP)); // Xóa sản phẩm nếu mã trùng khớp
        if (removed) {
            System.out.println(">> Xóa sản phẩm thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm với mã: " + maSP);
        }
    }

    // Phương thức sửa thông tin sản phẩm theo mã
    public void suaSanPham() {
        System.out.print("Nhập mã sản phẩm cần sửa: ");
        String maSP = scanner.nextLine(); // Nhập mã sản phẩm cần sửa
        SanPham sp = timKiemSanPhamTheoMa(maSP); // Tìm sản phẩm theo mã
        if (sp != null) {
            // Nếu tìm thấy, yêu cầu nhập thông tin mới
            System.out.print("Nhập tên sản phẩm mới: ");
            String tenMoi = scanner.nextLine(); // Nhập tên mới
            System.out.print("Nhập số lượng mới: ");
            int soLuongMoi = scanner.nextInt(); // Nhập số lượng mới
            System.out.print("Nhập giá mới: ");
            double giaMoi = scanner.nextDouble(); // Nhập giá mới
            scanner.nextLine(); // Xóa bộ đệm
            // Cập nhật thông tin sản phẩm
            sp.setTenSP(tenMoi);
            sp.setSoLuong(soLuongMoi);
            sp.setDonGia(giaMoi);
            System.out.println(">> Sửa sản phẩm thành công!");
        } else {
            System.out.println(">> Không tìm thấy sản phẩm với mã: " + maSP);
        }
    }

    // Phương thức lưu danh sách sản phẩm vào file
    public void luuFile() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/sanphams.dat", true))) {
            // Lưu danh sách sản phẩm vào file
            outputStream.writeObject(danhSachSP);
            System.out.println("Lưu file thành công!");
        } catch (IOException e) {
            // Xử lý ngoại lệ khi mở file không thành công
            System.out.println("Không thể mở file để lưu!");
            e.printStackTrace();
        }
    }

    // Phương thức đọc danh sách sản phẩm từ file
    public void docFile() {
        danhSachSP.clear(); // Xóa danh sách hiện tại trước khi đọc từ file
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/sanphams.dat"))) {
            while (true) {
                try {
                    @SuppressWarnings("unchecked")
                    List<SanPham> sv = (List<SanPham>) inputStream.readObject(); // Đọc danh sách sản phẩm từ file
                    danhSachSP.addAll(sv); // Thêm các sản phẩm vào danh sách
                } catch (EOFException e) {
                    break; // Kết thúc đọc file
                }
            }
            System.out.println("Đọc file thành công!");
        } catch (IOException | ClassNotFoundException e) {
            // Xử lý ngoại lệ khi không thể mở file hoặc lỗi định dạng file
            System.out.println("Không thể mở file để đọc!");
            e.printStackTrace();
        }
    }

    public void banHang() {
        System.out.print("Nhập mã sản phẩm: ");
        String maSP = scanner.nextLine();
        SanPham sp = timKiemSanPhamTheoMa(maSP); // Tìm sản phẩm theo mã
        if (sp != null) {
            System.out.print("Nhập số lượng bán: ");
            int soLuongBan = scanner.nextInt();
            scanner.nextLine(); // Xóa bộ đệm

            if (soLuongBan <= sp.getSoLuong()) {
                double donGia = sp.getDonGia();
                double tongTien = donGia * soLuongBan;

                // Cập nhật số lượng sản phẩm
                sp.setSoLuong(sp.getSoLuong() - soLuongBan);

                // Ghi nhận doanh thu
                String ngayBan = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                quanLyDoanhThu.ghiNhanDoanhThu(ngayBan, tongTien);

                // Ghi nhận hóa đơn
                HoaDon hoaDon = new HoaDon(sp.getMaSP(), sp.getTenSP(), donGia, soLuongBan, ngayBan);
                quanLyHoaDon.ghiNhanHoaDon(hoaDon);

                // Hiển thị hóa đơn
                System.out.println(String.format("Mã SP: %s%nTên SP: %s%nSố Lượng: %d%nĐơn Giá: %.2f%nNgày Bán: %s%nTổng Tiền: %.2f",
                        hoaDon.getMaSP(), hoaDon.getTenSP(), hoaDon.getSoLuong(), hoaDon.getDonGia(), hoaDon.getNgayBan(), tongTien));
            } else {
                System.out.println("Số lượng bán không hợp lệ.");
            }
        } else {
            System.out.println("Không tìm thấy sản phẩm với mã: " + maSP);
        }
    }
}
