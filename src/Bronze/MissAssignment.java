package Bronze;

import java.util.Scanner;

public class MissAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] student = new int[31];
        int [] special = new int[28];

        for(int i = 1; i <= 30; i++){
            student[i] = i;
        }

        for(int i = 0; i < 28; i++){
            special[i] = sc.nextInt();
        }

        for(int i = 1; i <= 30; i++){
            int flag = 0;
            for(int j = 0; j < 28; j++){
                if(student[i] == special[j]){
                    flag = 1;
                    break;
                }
            }

            if(flag == 0){
                System.out.println(i + " ");
            }
        }
    }
}