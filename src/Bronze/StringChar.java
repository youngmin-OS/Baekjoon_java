package Bronze;

import java.util.Scanner;

public class StringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            char ch1 = s.charAt(0);
            char ch2 = s.charAt(s.length() - 1);
            System.out.print(ch1);
            System.out.print(ch2);
            System.out.println();
        }
    }
}
