package Bronze;

import java.util.Scanner;

class Shopping {
    int total_price;
    int total_quantity;
    int[] price = new int[total_quantity];
    int[] quantity = new int[total_quantity];

    Shopping(int total_quantity){
        this.total_quantity = total_quantity;
        this.price = new int[total_quantity];
        this.quantity = new int[total_quantity];
    }

    int calculate() {
        int temp = 0;
        for (int i = 0; i < total_quantity; i++) {
            temp += price[i] * quantity[i];
        }
        return temp;
    }
}

public class Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tp = sc.nextInt();
        int tq = sc.nextInt();
        Shopping s = new Shopping(tq);
        s.total_price = tp;

        for (int i = 0; i < s.total_quantity; i++) {
            s.price[i] = sc.nextInt();
            s.quantity[i] = sc.nextInt();
        }

        if(s.calculate() == s.total_price){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

