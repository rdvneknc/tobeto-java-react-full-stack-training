package Q2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        double input = scan.nextInt();

        double number1 = 0;
        double number2 = 1;
        double sum;

        System.out.println("Fibonacci series of " + input );

        for (int i = 1; i <= input; i++) {
            System.out.print(number1 + " , ");


            sum = number1 + number2;
            number1 = number2;
            number2 = sum;
        }

        scan.close();
    }
}