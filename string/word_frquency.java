package string;
import java.util.HashMap;

public class word_frquency {
    public static void wordFrequency(String str){
        String[] words = str.split(" ");
        HashMap<String,Integer> hs = new HashMap<>();
        for (String word:words) {
            hs.put(word, hs.getOrDefault(word, 0)+1);
        }
        System.out.println(hs);
    }
    public static void main(String[] args) {
        wordFrequency("My name is John and my name is Doe");
    }
    
}
