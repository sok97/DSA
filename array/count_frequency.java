package array;

import java.util.HashMap;
import java.util.Map; // Imported to loop through and print the map

public class count_frequency {
    public static void Frequency(int arr[]){
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int num : arr){
            if(!hs.containsKey(num)){
                // Your code: If it's not there, add it with a count of 1
                hs.put(num, 1);
            }
            else{
                // Completed: If it IS there, get the old value and add 1
                int currentCount = hs.get(num);
                hs.put(num, currentCount + 1);
            }
        }

        // To see your results, we loop through your hashmap 'hs' and print it
        for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 4, 5, 3, 2};
        
        // Calling your Frequency method
        Frequency(arr);
    }
}