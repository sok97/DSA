package array;

public class missingNumbers {
public static void missingNumber(int[] arr) {
    int max = arr[0];

    for (int num : arr) {
        if (num > max) {
            max = num;
        }
    }

    boolean[] visited = new boolean[max + 1];

    for (int num : arr) {
        visited[num] = true;
    }

    for (int i = 1; i <= max; i++) {
        if (!visited[i]) {
            System.out.println(i);
        }
    }
}
    public static void main(String[] args) {
        int arr[] ={1 ,3,5,6,9,10,14};
        missingNumber(arr);
    }
}
