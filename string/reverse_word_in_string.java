package string;

public class reverse_word_in_string {
      public static String reverseWords(String s) {
     int i = s.length() - 1;
        StringBuilder result = new StringBuilder();
        
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--; 
            if (i < 0) break;
            int j = i;
            while (j >= 0 && s.charAt(j) != ' ') j--; 
            if (result.length() > 0) result.append(" ");
            result.append(s, j + 1, i + 1);
            i = j;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "hello world";
        String res = reverseWords(s);
        System.out.println(res);
    }
}
