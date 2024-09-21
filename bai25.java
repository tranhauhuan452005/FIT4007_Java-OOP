import java.util.Scanner;

public class bai25 {
    public static boolean isPrime(int num) {
        // Hàm kiểm tra số nguyên tố
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = scanner.nextInt();

        int sum = 0;
        for (int i = 2; i < N; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("Tổng các số nguyên tố nhỏ hơn " + N + " là: " + sum);
    }
}