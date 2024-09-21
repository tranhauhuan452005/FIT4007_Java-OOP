public class bai13 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Vui lòng nhập giá trị n từ dòng lệnh.");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            int tong = n * (n + 1) / 2;
            System.out.println("Tổng từ 1 đến " + n + " là: " + tong);
        } catch (NumberFormatException e) {
            System.out.println("Tham số đầu tiên phải là một số nguyên.");
        }
    }
}