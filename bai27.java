import java.util.Scanner;

public class bai27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số Fibonacci: ");
        int n = scanner.nextInt();

        int fibo1 = 1, fibo2 = 1, temp;
        System.out.print(fibo1 + " " + fibo2 + " ");

        for (int i = 3; i <= n; i++) {
            temp = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = temp;
            System.out.print(temp + " ");
        }
    }
}