import java.util.StringTokenizer;

public class bai21 {
    public static void main(String[] args) {
        String S = "Bai Tap Mon Lap Trinh Java";
        tachChuoi(S);
    }

    public static void tachChuoi(String S) {
        StringTokenizer tokenizer = new StringTokenizer(S);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}