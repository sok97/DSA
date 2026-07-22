package dsafoundation;

import java.util.Scanner;

public class reverse_number {
    public static int reverse(int x){
        int rev =0; 
        int rem;
        while(x!=0){
            rem = x%10;
            rev = (rev*10)+rem;
            x =x/10;
        }
        // if (x<0){
        //     x = 1 *x;
        //     return x;
        // } 
        {
            
        }
        return rev;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
       System.out.println(reverse(x));
    }
}
