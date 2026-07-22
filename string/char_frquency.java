package string;

import java.util.HashMap;

public class char_frquency {
    public static void charFrequwncy(String str){
        HashMap<Character,Integer> hs = new HashMap<>();
        for ( char c:str.toCharArray()) {
            hs.put(c, hs.getOrDefault(c, 0)+1);
        }
        System.out.println(hs);
    }
    public static void main(String[] args) {
    charFrequwncy("programming");
    }
    
}
