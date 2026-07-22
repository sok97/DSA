package array;

public class missingnumber {
    public static int missingNumber(int [] num){
        int actual_sum =0;
        int n = num.length;
        int expected_sum = (n*(n+1))/2;
        for (int i = 0; i < num.length; i++) {
            actual_sum = actual_sum+num[i];

        }
        return expected_sum-actual_sum;
    }
   public static void main(String[] args) {
    int[] num = {0,1};
   System.out.println(missingNumber(num));
   } 
}
