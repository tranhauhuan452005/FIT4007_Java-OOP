import java.util.Scanner;

public class bai29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của tam giác (N): ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) { // Vòng lặp ngoài: điều khiển số hàng
            for (int j = 1; j <= i; j++) { // Vòng lặp trong: in dấu * cho mỗi hàng
                System.out.print("* ");
            }
            System.out.println(); // Xuống dòng sau khi in xong một hàng
        }
    }
}