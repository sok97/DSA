package foundation;

public class addDigits {
    public static int addDigits(int num){
        if(num<10){
            return num;
        }
      
       while(num>=10){
          int sum =0;
        while (num>0) {
             sum+= num%10;
        num = num/10;
        }
       num =sum;
       }
       
        return num ;
    }
    public static void main(String[] args) {
        int n = 38;
        System.out.println(addDigits(n));
    }
}
// 38 = module karile 8 haba 