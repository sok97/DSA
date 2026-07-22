package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class twosum {
    public static int[] twoSum(int[] nums,int target){
        // for(int i =0;i<nums.length;i++){
        //     for(int j=0;j<i;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // //time complexity =o(n^2)
        //  }  
        // return new int[]{-1,-1};


        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target-nums[i];
            if(hs.containsKey(complement)){
                return new int[]{hs.get(complement),i};
            }
            hs.put(nums[i], i);
        }
     return new int[]{-1,-1};

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n  = sc.nextInt();
        int []nums = new int[n];
        System.out.println("Enter the array number");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int[] result = twoSum(nums, target);
        if(result[0]==-1){
System.out.println("No two numbers found");
        }
        else{
System.out.println("Indices"+ Arrays.toString(result));
System.out.println("values:"+ nums[result[0]]+" "+ nums[result[1]]);
        }
        sc.close();
    }
    
}
