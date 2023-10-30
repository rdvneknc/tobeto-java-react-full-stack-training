package Q4;

import java.util.Arrays;


public class Anagrams {
    public static void main(String[] args) {

        String str1 = "celalettin";
        String str2 = "celaletin";

        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are anagrams of each other.");
        } else {
            System.out.println("The two strings are not anagrams of each other.");
        }
    }

    static boolean areAnagrams(String str1, String str2) {
        // Check if the lengths of both strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Sort both strings and compare

        //str1.toCharArray() ifadesi, bir String nesnesindeki karakterleri bir karakter dizisine (char array) dönüştürür.
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        //Arrays.equals iki dizi (array) nesnesinin içeriğini karşılaştırmak için kullanılır. Bu metod, dizilerin eşit olup olmadığını kontrol eder,
        return Arrays.equals(charArray1, charArray2);
    }
}
