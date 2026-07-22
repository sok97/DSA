package string;

public class count_voewls_and_consonant {

    public static void count(String str) {
        int vowels = 0;
        int consonant = 0;

        String str1 = str.toLowerCase();
        int n = str1.length();

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' ||
                str1.charAt(i) == 'i' || str1.charAt(i) == 'o' ||
                str1.charAt(i) == 'u') {
                vowels++;
            } else {
                consonant++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonant);
    }

    public static void main(String[] args) {
        count("Hello");
    }
}