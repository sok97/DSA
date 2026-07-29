package hashmap;

import java.util.HashMap;
import java.util.Map;

public class ransom {
      public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        Map<Character,Integer> mp = new HashMap<>();
        // character in magazine
        for(char c:magazine.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0)+1);
        }
        //try to construct a ransom note
        for(char c:ransomNote.toCharArray()){
            if(!mp.containsKey(c)){
                    return false;
            }
            mp.put(c, mp.get(c)-1);
        }
        return  true;


    }
    public static void main(String[] args) {
    System.out.println(canConstruct("aa", "aab"));
    }
}
