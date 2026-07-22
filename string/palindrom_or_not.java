package string;
public class palindrom_or_not {

public static boolean palindrome(String str){
    String rev = "";
    for(int i =str.length()-1;i>=0;i--){
        rev = rev + str.charAt(i);
         
    }
     return str.equals(rev);
}

    public static void main(String[]args){
        
        String str = "madam";
        if(palindrome(str)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
