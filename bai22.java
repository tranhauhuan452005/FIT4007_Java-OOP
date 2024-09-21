import java.util.Scanner;

public class bai22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int n = scanner.nextInt();

        boolean isPrime = true; // Giả sử số nhập vào là số nguyên tố

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break; // Dừng vòng lặp khi tìm thấy ước số
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }
    }
}