package Bronze;
import java.util.Scanner;

public class FindAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int [] ar = new int[26];

        for(int i = 0; i < 26; i++){
            ar[i] = -1;
        }

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int idx = c - 'a';

            if(ar[idx] == -1){
                ar[idx] = i;
            }
        }

        for(int i = 0; i < 26; i++){
            System.out.print(ar[i] + " ");
        }
    }
}
