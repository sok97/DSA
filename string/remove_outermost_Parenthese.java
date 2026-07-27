package string;

import java.util.ArrayDeque;
import java.util.Deque;

public class remove_outermost_Parenthese{
     public static String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        Deque<Character> d = new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                if(!d.isEmpty()){
                    res.append(c);
                }
                d.push(c);
            }
            else{ // c = )
                 d.pop();
                if (!d.isEmpty()) {
                    res.append(c);
                }
               
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "(()())(())";
        String res = removeOuterParentheses(s);
        System.out.println(res);
    }
}