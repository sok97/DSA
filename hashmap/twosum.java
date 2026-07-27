package hashmap;

import java.util.HashMap;

public class twosum {
    public static int[] twoSum(int[]nums,int target){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int comp = target-nums[i];
            if(mp.containsKey(comp)){
                return new int[]{mp.get(comp),i};
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int []nums = {2,7,11,15};
        int target = 18;
        int []result = twoSum(nums,target);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    
}
