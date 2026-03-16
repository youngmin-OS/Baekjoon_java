package Bronze;
import java.util.*;
public class FinalInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int resultA;
        int resultB;

        int h1 = a / 100;
        int t1 = (a / 10) % 10;
        int o1 = a % 10;

        resultA = o1 * 100 + t1 * 10 + h1;

        int h2 = b / 100;
        int t2 = (b / 10) % 10;
        int o2 = b % 10;

        resultB = o2 * 100 + t2 * 10 + h2;

        boolean bigger = (resultA > resultB) ? true : false;
        if(bigger == true){
            System.out.println(resultA);
        }
        else{
            System.out.println(resultB);
        }

    }
}
