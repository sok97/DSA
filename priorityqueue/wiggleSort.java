// Given an integer array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....
// You may assume the input array always has a valid answer.
// Example 1:

// Input: nums = [1,5,1,1,6,4]
// Output: [1,6,1,5,1,4]
// Explanation: [1,4,1,5,1,6] is also accepted.
// Example 2:

// Input: nums = [1,3,2,2,3,1]
// Output: [2,3,1,3,1,2]

package priorityqueue;

import java.util.*;

public class wiggleSort {
   public static void wiggleSort(int[] nums){
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
    for(int x: nums){
        maxHeap.add(x);
        minHeap.add(x);
    }
    
    for(int i = 0; i < nums.length; i++){
        if(i % 2 == 0){
            nums[i] = minHeap.poll();  // Even indices get smaller values
        } else {
            nums[i] = maxHeap.poll();  // Odd indices get larger values
        }
    }
}

    public static void main(String[] args) {
        int nums[] = {1, 5, 1, 1, 6, 4};
        wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
