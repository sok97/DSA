package foundation;

import java.util.Scanner;

public class powerOf3 {
    public  static boolean isPowerofThree(int n){
        if(n<0){
            return false;
        }
     while(n%3==0){
        n = n/3;
     }
     return n==1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerofThree(n));
    }
}
