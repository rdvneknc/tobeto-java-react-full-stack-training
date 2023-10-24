package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        String midText = "İlginizi çekebilir...";
        String bottomText = "Vade Süresi";

        System.out.println(midText);

        int maturity = 12;

        double dollarYesterday = 18.25;
        double dollarToday = 18.30;

        boolean hasDollarFallen = false;

        String arrowDirection = "";

        if (dollarToday < dollarYesterday) {
            arrowDirection = "down.svg";
            System.out.println(arrowDirection);
        } else if (dollarToday > dollarYesterday) {
            arrowDirection = "up.svg";
            System.out.println(arrowDirection);
        } else {
            arrowDirection = "equal.svg";
            System.out.println(arrowDirection);
        }

        String[] loans = {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};




        for (int i = 0; i < loans.length; i++ ){
            System.out.println(loans[i]);
        }


    }
}