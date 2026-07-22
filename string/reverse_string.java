package string;

class reverse_string {
    public static String reveString(String str){
        char c[] = str.toCharArray();
        int left =0;
        int right = c.length-1;
        while(left<right){
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }
          return new String(c);
    }
public static void main(String[] args) {
      String str = "Hello";
        System.out.println(reveString(str));
    }   
}