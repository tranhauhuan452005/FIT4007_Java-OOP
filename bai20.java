import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi s: ");
        String s = scanner.nextLine();

        int count = countDigits(s);
        System.out.println("Số lượng ký tự số trong chuỗi là: " + count);
    }

    public static int countDigits(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Cách 1: Sử dụng mã ASCII
            // if (ch >= '0' && ch <= '9') {
            //     count++;
            // }

            // Cách 2: Sử dụng class Character
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }
}