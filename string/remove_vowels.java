package string;

public class remove_vowels {
    public static String remove(String str){
         StringBuilder res = new StringBuilder();
         int n = str.length();
         
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                str.charAt(i) == 'u') {
                continue;
         }
         else{
          res.append(str.charAt(i));}
                         }
        return res.toString();
         
    }
    public static void main(String[] args) {
          String str = "education";
        System.out.println(remove(str));

    }
}
