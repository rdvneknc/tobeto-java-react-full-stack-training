package org.example.Q1;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            if (isArmstrongNumber(number)) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }

        // Function to check if a number is an Armstrong number
        static boolean isArmstrongNumber(int num) {
            int originalNum, remainder, result = 0;
            int n = 0;

            originalNum = num;

            // Find the number of digits in the number
            while (originalNum != 0) {
                originalNum /= 10;
                n++;
            }

            originalNum = num;

            // Calculate the sum of digits raised to the power of n
            while (originalNum != 0) {
                remainder = originalNum % 10;
                int power = 1;
                for (int i = 0; i < n; i++) {
                    power *= remainder;
                }
                result += power;
                originalNum /= 10;
            }

            // Check if the number is an Armstrong number
            if (result == num) {
                return true;
            } else {
                return false;
            }
        }

}
