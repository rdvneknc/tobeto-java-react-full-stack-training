package Q5;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueCharacters {

        public static void main(String[] args) {

            //String str1 = "celalettin";

            // string'in uzunluğunu al
            // String'i hashset'e ekle
            // hashset'in uzunluğunu yazdır
            // string'in uzunluğuyla hashset'in uzunluğunu eşitle

            String text = "celalettin";
            HashSet<String> str = new HashSet<>();

            for (int i = 0; i < text.length(); i++) {
                str.add(text.substring(i, i + 1));
            }
            if (text.length() == str.size()) {
                System.out.println("Unique");
            } else {
                System.out.println("Not Unique!");
            }
        }


    ublic static void main(String[] args) {
        String text = "abcdefg"; // Denediğiniz stringi buraya koyun

        if (hasAllUniqueCharacters(text)) {
            System.out.println("String has all unique characters.");
        } else {
            System.out.println("String does not have all unique characters.");
        }
    }

    public static boolean hasAllUniqueCharacters(String text) {
        if (text.length() > 128) {
            //ascii karakter
            // Eğer string 128 karakterden uzunsa, kesinlikle tekrarlanan karakterler vardır.
            return false;
        }

        boolean[] characterSet = new boolean[128];

        for (int i = 0; i < text.length(); i++) { //kelime
            int val = text.charAt(i); //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            if (characterSet[val]) {
                return false; // Karakter zaten daha önce görülmüş.
            }
            characterSet[val] = true;
        }
        return true; // Tüm karakterler benzersiz.


    }


    static class GfG {
        boolean uniqueCharacters(String str)
        {

            str = "Kelime";

            // If at any time we encounter 2 same
            // characters, return false
            for (int i = 0; i < str.length(); i++)
                for (int j = i + 1; j < str.length(); j++)
                    if (str.charAt(i) == str.charAt(j))
                        return false;

            // If no duplicate characters encountered,
            // return true
            return true;
        }




        public static void main(String args[])
        {
            boolean UniqueCharacters = false;

            if (UniqueCharacters == true){
                System.out.println("Unique");
            } else {
                System.out.println("Not Unique");
            }

//            GfG obj = new GfG();
//            String input = "GeeksforGeeks";
//
//            if (obj.uniqueCharacters(input))
//                System.out.println("The String " + input + " has all unique characters");
//            else
//                System.out.println("The String " + input + " has duplicate characters");
        }
    }



}


