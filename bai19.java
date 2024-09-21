import java.util.Scanner;

public class bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập chuỗi: ");
        String inputString = scanner.nextLine();

        // Đếm số lần ký tự 'a' xuất hiện
        int count = countA(inputString);
        System.out.println("Số lần ký tự 'a' xuất hiện: " + count);
    }

    public static int countA(String string) {
        int count = 0;
        for (char c : string.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }
}