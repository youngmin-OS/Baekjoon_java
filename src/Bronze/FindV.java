package Bronze;

import java.util.Scanner;

public class FindV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        int count = 0;
        for(int i = 0; i < n ; i++){
            if(v == ar[i]){
                count++;
            }
        }

        System.out.println(count);
    }
}
