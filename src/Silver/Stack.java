package Silver;
import java.util.*;

public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num;
        int []stack = new int[n];
        int stackCount = 0;

        for(int i = 0; i < n; i++){
            String op = sc.next();
            if(op.equals("push")){
                num = sc.nextInt();
                stack[stackCount++] = num;
            }

            else if(op.equals("top")){
                if(stackCount==0){
                    System.out.println(-1);
                }
                else {
                    System.out.println(stack[stackCount - 1]);
                }
            }

            else if(op.equals("size")){
                System.out.println(stackCount);
            }

            else if(op.equals("empty")){
                if(stackCount == 0){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }

            else if(op.equals("pop")){
                if(stackCount == 0){
                    System.out.println(-1);
                }
                else {
                    System.out.println(stack[--stackCount]);
                }
            }
        }
    }
}
