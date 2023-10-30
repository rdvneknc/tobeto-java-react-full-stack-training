package Q3;

public class CharacterCount {

    public static void main(String[] args) {

        String string = "Oyun bilgisayarı";
        int count = 0;




        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ')               //tobeto string.charAt()
                count++;
        }

        System.out.println("Total number of characters in this string is : " + count);
    }

}

