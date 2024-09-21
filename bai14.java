public class bai14 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Vui lòng nhập giá trị n từ dòng lệnh.");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);

            int tong;
            if (n % 2 == 0) { // n là số chẵn
                // Tính tổng các số lẻ từ 1 đến n-1
                int soSoHang = (n - 1) / 2;
                tong = soSoHang * soSoHang;
            } else { // n là số lẻ
                // Tính tổng các số chẵn từ 2 đến n
                int soSoHang = n / 2;
                tong = soSoHang * (soSoHang + 1);
            }

            System.out.println("Tổng là: " + tong);
        } catch (NumberFormatException e) {
            System.out.println("Tham số đầu tiên phải là một số nguyên.");
        }
    }
}