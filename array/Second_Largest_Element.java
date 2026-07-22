package array;

public class Second_Largest_Element {
    public static int secondLargest(int arr[]){
int largest = -999999;
int secondLarge= -99999;
for (int i = 0; i < arr.length; i++) {
    if(arr[i]> largest){
        secondLarge = largest;
        largest = arr[i];
    }
    else if(arr[i] >secondLarge && arr[i]!=largest){
        secondLarge = arr[i];
    }
}
return secondLarge;
    }
     public static int secondSmallest(int arr[]){
int smallest = 99999;
int secondSmallest = 99999;
for (int i = 0; i < arr.length; i++) {
    if(arr[i]< smallest){
        secondSmallest = smallest;
        smallest = arr[i];
    }
    else if(arr[i] <secondSmallest && arr[i]!=smallest){
        secondSmallest = arr[i];
    }
}
return secondSmallest;
}
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Second Largest Element: " + secondLargest(arr));
        System.out.println("Second Smallest Element: " + secondSmallest(arr));
    }

}
