package Bronze;

import java.util.Scanner;

public class WordInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = sc.nextInt();
        System.out.println(s.charAt(i - 1));
    }
}
