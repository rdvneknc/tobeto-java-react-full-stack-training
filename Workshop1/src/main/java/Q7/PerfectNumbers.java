package Q7;


// Write a Java program finds first 10 perfect numbers.

// Mükemmel sayı, sayılar teorisinde, kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayıdır.
public class PerfectNumbers {

    public static void main(String[] s1){

        double num = 0;
        double sum = 0;

        for (num = 1; num < 999999999; num++) {
            for (double j = 1; j < num; j++) {
                if (num % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == num) {
                System.out.println(sum);
            }
            sum = 0;
        }

    }
}


