package array;
class Find_Second_Smallest_and_Second_Largest_Element_in_an_array{
    public static int secondSmallest(int arr[], int n){
        if(n<2){
            return -1;
        }
        int small = 9999999;
        int secondSmall = 9999999;


        for(int i =0;i<n;i++){
            if(arr[i]<small){
             secondSmall = small;
                small = arr[i];
            }
             else if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }


        return secondSmall;
    }
     public static int secondLargest(int arr[], int n){
        if(n<2){
            return -1;
        }
        int large = -99999;
        int secondLarge =-99999;
        
        for(int i =0;i<n;i++){
            if(arr[i]>large){
             secondLarge = large;
                large = arr[i];
            }
             else if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }

    public static void main(String[] args) {
        int[] arr = {24242,52523,25252,52,5252};
        int n = arr.length;
            int small = secondSmallest(arr, n);
            int large = secondLargest(arr, n);
            System.out.println(small);
            System.out.println(large);
    }
}