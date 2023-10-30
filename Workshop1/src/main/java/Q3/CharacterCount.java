package Q3;

public class CharacterCount {

    public static void main(String[] args) {
        String string = "Tobeto";
        int count = 0;


        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ')
                count++;
        }

        System.out.println("Total number of characters in this string is : " + count);
    }

}
