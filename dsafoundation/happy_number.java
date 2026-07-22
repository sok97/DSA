package dsafoundation;

import java.util.Scanner;

public class happy_number {
    public static boolean isHappy(int n){
         
        for (int i = 0; i < 100000; i++) {
            if(n==1) return true;
            n = digit(n);
        }
        return false;

        }
    
    private static int digit(int x){
        int rem = 0;
        int rev =0;
        while(x>0){
            rem = x%10;
            rev = (rem*rem)+rev;
            x =x/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isHappy(n));
        sc.close();
    }
    
}
