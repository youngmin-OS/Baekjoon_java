package Silver;

import java.util.Objects;
import java.util.Scanner;

class Subject{
    String name;
    double grade;
    String score;
    double numScore;

    double charToNum(String score){
        if(Objects.equals(score, "A+")){
            this.numScore = 4.5;
        }

        else if(Objects.equals(score, "A0")){
            this.numScore = 4.0;
        }

        else if(Objects.equals(score, "B+")){
            this.numScore = 3.5;
        }

        else if(Objects.equals(score, "B0")){
            this.numScore = 3.0;
        }

        else if(Objects.equals(score, "C+")){
            this.numScore = 2.5;
        }

        else if(Objects.equals(score, "C0")){
            this.numScore = 2.0;
        }

        else if(Objects.equals(score, "D+")){
            this.numScore = 1.5;
        }

        else if(Objects.equals(score, "D0")){
            this.numScore = 1.0;
        }

        else if(Objects.equals(score, "F")){
            this.numScore = 0.0;
        }

        else if(Objects.equals(score, "P")){
            this.numScore = 0.0;
            this.grade = 0.0;
        }

        return numScore;
    }
}

public class YourAchieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Subject [] s = new Subject[20];

        for(int i = 0; i < 20; i++){
            s[i] = new Subject();
            s[i].name = sc.next();
            s[i].grade = sc.nextDouble();
            s[i].score = sc.next();
            s[i].numScore = s[i].charToNum(s[i].score);
        }

        double totalGrade = 0;
        double totalScore = 0;
        for(int i = 0; i < 20; i++){
            totalGrade += s[i].grade;
            totalScore += s[i].numScore * s[i].grade;
        }
        double avg = totalScore/ totalGrade;
        System.out.println(avg);
    }
}
