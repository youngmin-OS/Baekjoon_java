package Bronze;

import java.util.Scanner;

public class ChangeBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] ar = new int[101];

        int a, b;

        for(int i = 1; i <= n; i++){
            ar[i] = i;
        }

        for(int i = 0; i < m; i++){
            a = sc.nextInt();
            b = sc.nextInt();

            int temp = ar[a];
            ar[a] = ar[b];
            ar[b] = temp;
        }

        for(int i = 1; i <= n; i++){
            System.out.print(ar[i] + " ");
        }
    }
}
