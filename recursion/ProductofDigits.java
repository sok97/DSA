package recursion;

public class ProductofDigits {
    public static int product(int n){
        if(n==0)return  1;
        int digit = n%10;
        return (digit* product(n/10));
    }
    public static void main(String[] args) {
        int n = 12343;
        System.out.println(product(n));
    }
    
}
