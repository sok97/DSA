package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class non_reapeating {
    public static void main(String[] args) {
        String str = "Swiss".toLowerCase();
        HashMap<Character,Integer> hs = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            hs.put(c,hs.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : hs.entrySet()){
            if(entry.getValue()==1){
                 System.out.println("First non-repeating character: " + entry.getKey());
                break;
            }
        }
    }
}
