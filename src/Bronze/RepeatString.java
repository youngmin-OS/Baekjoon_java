package Bronze;
import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int r = sc.nextInt();
            String s = sc.next();

            String result = "";

            for(int j = 0; j < s.length(); j++){
                for(int k = 0; k < r; k++){
                    result += s.charAt(j);
                }
            }
            System.out.println(result);
        }
    }
}
