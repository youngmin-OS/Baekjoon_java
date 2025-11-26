package Bronze;

import java.util.Scanner;

public class Basket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] ar = new int[101];
        int a, b ,c;

        for(int i = 0; i < m; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            for(int j = a; j <= b; j++){
                ar[j] = c;
            }
        }

        for(int i = 1; i <= n; i++){
            System.out.print(ar[i] + " ");
        }
    }
}
