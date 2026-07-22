package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fizzbuzz {
    public static List<String> fizzBuzz(int n){
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
    if(i%3==0){
          ans.add("Fizz");
    }    
   else if (i%5==0) {
        ans.add("Buzz");
    }        
   else if(i%3==0 && i%5==0){
        ans.add("FizzBuzz");
    }
    else{
        ans.add(String.valueOf(i));
    }
        }
        return ans;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     List<String> res = fizzBuzz(n);
     for (String string : res) {
        System.out.println(string);
     }     
        
    }
    
}
