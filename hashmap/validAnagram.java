package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class validAnagram {
     public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        // char[] arr1 = s.toCharArray(); // sorting approach
        // char[] arr2 = t.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        
        // return Arrays.equals(arr1, arr2);

        HashMap<Character,Integer> hs = new HashMap<>();
        for(char c:s.toCharArray()){
            hs.put(c, hs.getOrDefault(c, 0)+1);
        }
        for(char c:t.toCharArray()){
                    if (!hs.containsKey(c))
                return false;

            hs.put(c, hs.get(c) - 1);

            if (hs.get(c) == 0)
                hs.remove(c);
        }

        return hs.isEmpty();


    }
    public static void main(String[] args) {
        System.out.println(isAnagram("cat", "tat"));
    }
}
