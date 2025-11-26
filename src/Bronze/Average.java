package Bronze;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] score = new double[n];

        double max = 0;

        for(int i = 0; i < n; i++){
            score[i] = sc.nextDouble();
            for(int j = 0; j < n; j++){
                if(max < score[j]){
                    max = score[j];
                }
            }
        }

        double total = 0;
        for(int i = 0; i < n; i++){
            score[i] = score[i] / max * 100;
            total += score[i];
        }

        double avg = total / n;
        System.out.println(avg);
    }
}
