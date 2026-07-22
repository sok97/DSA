package array;

public class movezeros {
    public static void moveZeroes(int[] nums){
   
        int left =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i]=temp;
                left++;
                // tc - o(n)
                // sc- o(1)
            }
        }
    }
    public static void main(String[] args) {
        int nums[]= {0,1,0,3,12};
      moveZeroes(nums);
        System.out.println("output");
        for(int num:nums){
            System.out.println(num);
        
    }
    
    }}
