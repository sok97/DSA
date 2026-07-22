package foundation;

import java.util.Scanner;

public class number_of_digit1 {
    public static int countDigitOne(int n){
        int count =0;
        if(n==0){
            return 0;
        }
        for (int i = 1; i <=n; i++) {
            int x =i;
            while (x>0) {
                if (x%10 ==1) {
                    count++;
                    
                }
                x=x/10;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigitOne(n));
    }
}
