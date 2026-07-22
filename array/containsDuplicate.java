package array;

import java.util.HashMap;

public class containsDuplicate {
    public  static boolean containsDuplicate(int[]nums){
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int n:nums){
            hs.put(n, hs.getOrDefault(n,0)+1);
            if(hs.get(n)>1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] ={1,2,3,1};
       System.out.println( containsDuplicate(nums));
    }
    
}
