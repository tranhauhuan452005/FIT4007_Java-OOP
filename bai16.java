public class bai16 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Vui lòng nhập đúng 2 tham số: hệ số a và b.");
            return;
        }

        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);

            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -b / a;
                System.out.println("Phương trình có nghiệm x = " + x);
            }
        } catch (NumberFormatException e) {
            System.out.println("Cả hai tham số phải là số.");
        }
    }
}