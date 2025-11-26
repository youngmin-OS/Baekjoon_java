package Bronze;

import java.util.Scanner;

public class ReverseBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [] ar = new int[n + 1];
        for(int i = 1; i <= n; i++){
            ar[i] = i;
        }

        int [] result = new int[n + 1];
        int a, b;
        for(int i = 0; i < m; i++){
            a = sc.nextInt();
            b = sc.nextInt();

            while(a < b){
                int temp = ar[a];
                ar[a] = ar[b];
                ar[b] = temp;
                a++;
                b--;
            }
        }

        for(int i = 1; i <= n; i++){
            System.out.print(ar[i] + " ");
        }
    }
}
