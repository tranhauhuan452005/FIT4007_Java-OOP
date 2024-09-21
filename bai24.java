import java.util.Scanner;

public class bai24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng số nguyên N: ");
        int N = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            System.out.print("Nhập số thứ " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("Tổng của " + N + " số nguyên là: " + sum);
    }
}