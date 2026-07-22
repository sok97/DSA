package dsafoundation;

import java.util.Scanner;

public class palindrome_number {
    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        String s = Integer.toString(x);
        String rev = "";
        for(int i =s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        return s.equals(rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
        sc.close();
    }
    
}
