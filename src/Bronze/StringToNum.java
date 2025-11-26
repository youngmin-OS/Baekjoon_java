package Bronze;

import java.util.Scanner;

public class StringToNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = sc.next();
        int num = 0;
        for(int i = 0; i < n; i++){
            num += s.charAt(i) - '0';
        }

        System.out.println(num);
    }
}
