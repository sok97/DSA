package array;

import java.util.Scanner;

public class find_the_largest_element_in_an_array {
    public static int largestElement(int arr[]){
        int max = arr[0];
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("largest" +largestElement(arr));
        sc.close();
    }
}
