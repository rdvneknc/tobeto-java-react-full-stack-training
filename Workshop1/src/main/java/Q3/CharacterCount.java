package Q3;

public class CharacterCount {

    public static void main(String[] args) {

        String string = "Oyun Atı";
        int count = 0;


//  3-Write a Java program gives character counts in a string Ex: Tobeto -> t:2, o:2, b:1, e:1

        for(int i = 0; i < string.length(); i++) { //
            if(string.charAt(i) != ' ')
            {//tobeto string.charAt()
                count++;
        }

        System.out.println("Total number of characters in this string is : " + count);
    }
    }

}

