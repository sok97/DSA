package recursion;

public class powerOfN {
    public static double power(double x, int n){
        if(n==0) return 1;
        if(n<0) return 1/power(x, -n);
         return x*power(x, n-1);
    }
    public static void main(String[] args) {
        double x =10;
        int n=-2;
        System.out.println(power(x, n));
    }
    
}
