package dsafoundation;

import java.util.Scanner;

public class reverseString {
    public static void revers_String(char[] s){
       int left = 0;
       int right = s.length-1;
       while(left<right){
        char temp = s[left];
        s[left] =s[right];
        s[right] = temp;
        left++;
        right--; 
       }

    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       char[] c= str.toCharArray();
 revers_String(c);
 System.out.println(new String(c));
sc.close();
    }
    
}
