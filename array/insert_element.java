package array;

class Solution { // Fixed typo 'soultion' to 'Solution'
    public static int[] insertAtPosition(int[] arr, int pos, int x) {
        int newArr[] = new int[arr.length + 1];
        
        // Copy elements up to the target position
        for(int i = 0; i < pos; i++){ 
            newArr[i] = arr[i];
        }
        
        // Insert the new element
        newArr[pos] = x;
        
        // Shift and copy the remaining elements
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int pos = 2, x = 3;

        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // FIX: Call the method and store the result
        int[] resultArr = insertAtPosition(arr, pos, x);

        System.out.print("Modified Array: ");
        for (int num : resultArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}