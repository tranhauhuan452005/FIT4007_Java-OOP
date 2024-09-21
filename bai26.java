import java.util.Scanner;

public class bai26 {
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
        System.out.print("Nhập số lượng số nguyên tố N: ");
        int N = scanner.nextInt();

        int count = 0, sum = 0, num = 2;
        while (count < N) {
            if (isPrime(num)) {
                count++;
                sum += num;
            }
            num++;
        }

        System.out.println("Tổng của " + N + " số nguyên tố đầu tiên là: " + sum);
    }
}