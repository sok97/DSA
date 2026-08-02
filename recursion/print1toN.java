package recursion;

public class print1toN {
    public static void print1toN(int n){
        if(n==0){
            return ;
        }
    
        System.out.println(n);
            print1toN(n-1);
    }
    public static void main(String[] args) {
        int n =10;
        print1toN(n);
    }
    
}
