package org.example;


// Built-in Packages - Hali hazırda Java'nın altında olan importlar
import java.util.Arrays;


// Aşağıdakiler user-defined Packages
import org.example.inheritence.Animal;
import org.example.inheritence.Bird;
import org.example.inheritence.Dog;
import org.example.models.Example; //Paketten sadece example'ı import eder

import org.example.models.*; // Paketteki tüm tanımlama ve dosyaları import eder, genelde 5den fazla import olduğu zaman kullanılır


// Dependencies => Projenin bağımlılıkları (Dışarıdan import edilen packages)
import lombok.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String name = "Halit"; // geçici hafıza name:Halit
        var age = 25; // variable // Bir tip belirtmek istemiyorum
        // compiler benim için otomatik yapsın.
        int days = 50;
        // değişken türünü Reference type

        System.out.println(name);
        // Mantıksal operatörler
        // == != > < >= <=
        Boolean isLoggedIn = false;
        Boolean value2 = true;
        Boolean value3 = true;
        System.out.println(isLoggedIn);

        // programın belli bir şartı yerine getirdiğinde
        // execute etmesini istediğim kodlar..
        // Bir if bloğundan bir karar çıkar
        if (isLoggedIn) // True ise
        {
            System.out.println("Giriş yapılmış..");
        } else if (value3) {
            System.out.println("3. if bloğu");
        }
        if (2 == 1 && value2) {
            System.out.println("2. if bloğu");
        } else // eğer if çalışmazsa
        {
            System.out.println("Giriş yapılmamış..");
        }


        // true || false => true
        // false || true => true
        // false || false => false

        // true && true => true
        // false && true => false
        // false && false => false

        // Main Scope


        String text = "Deneme";

        if (true) {
            // 59.satırdaki if'in scope'u (kapsamı, alanı, bloğu)
            String text1 = "Deneme";
            if (false) {
                System.out.println(text);
                System.out.println(text1);
                String text2 = "Merhaba";
            }
            System.out.println(text);
        }


        int age2 = 17;
        Boolean canRegister;
        if (age2 < 18) {
            canRegister = false;
        }else{
            canRegister = true;
        }

        if (canRegister) {
            System.out.println("Kayıt olabilir");
        } else {
            System.out.println("Kayıt olamaz.");
        }


        String[] nameArray = {"Halit", "Ayşe", "Fatma"};

        String[] array2 = nameArray;

        array2[0] = "Enes";


        for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i]);
        }

        String[] array3 = Arrays.copyOf(nameArray, nameArray.length);
        System.out.println(nameArray);
        System.out.println(array3);

        array3[0] = "Vedat";

        for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i]);
        }



        Integer[] numbers = {1,2,3,4};


        Integer[] copyNumbers = Arrays.copyOf(numbers, numbers.length);

        for (Integer number: numbers) {
            System.out.println(number);
        }


        Product instance1 = new Product();
        instance1.setName("Laptop");
        instance1.setUnitPrice(5000);
        instance1.applyDiscount(10);

        Product instance2 = new Product();
        instance2.setName("Mouse");
        instance2.setUnitPrice(200);


        System.out.println("Ürün adı: " + instance1.name + " Ürün Fiyatı: " + instance1.unitPrice);

        // Construct - CONSTRUCTOR METHOD
        Product product = new Product();
        Product product1 = new Product("Deneme");
        Product product2 = new Product("Deneme 2", 500);
        System.out.println(product2.name);


        // PACKAGES

        Example example = new Example();
        Sample sample = new Sample();


        // INHERITANCE

        //Animal animal = new Animal(); // Kalıtımı yapan SuperClass

        //Kalıtımı alan Subclasses
        Bird bird = new Bird();
        Dog dog = new Dog();

        bird.breathe();
        bird.animalSound();

        dog.breathe();
        dog.animalSound();

        Animal animal = new Bird();
        Animal animal2 = new Dog();

        flyExternal(animal);
        flyExternal(animal2);

    }



    public static void flyExternal(Animal animal){
        if(animal instanceof Bird){ // Animal bir bird türü mü
            Bird bird = (Bird)animal;
            bird.fly();
        }
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.walk();
        }
    }



}