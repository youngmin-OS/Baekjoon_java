package Bronze;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] ar = new int[10];
        int [] result = new int[10];

        for(int i = 0; i < 10; i++){
            ar[i] = sc.nextInt();
            result[i] = ar[i] % 42;
        }

        int count = 10;
        for(int i = 0; i < 9; i++){
            for(int j = i + 1; j < 10; j++){
                if(result[i] == result[j]){
                    count--;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
