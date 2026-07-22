package array;

import java.util.Arrays; // Imported to easily print the array

public class reverse_an_array {
    public static void reverseArray(int arr[]) {
        int p1 = 0;
        int p2 = arr.length - 1;
        
        while (p1 < p2) {
            // Swap the actual elements in the array
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            
            // Move the pointers closer to the center
            p1++;
            p2--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {234324, 242424, 1414, 52525, 2};
        
        // 1. Call the reverse method
        reverseArray(arr);
        
        // 2. Print the modified array
        System.out.println(Arrays.toString(arr));
    }
}