package org.example.inheritence;

public class Bird extends Animal{

    public void fly(){
        System.out.println("Bird is flying..");
    }

    @Override
    public void animalSound() {
        System.out.println("Cik cik..");
    }

    @Override //annotation  Superclasstaki bir methodu değiştirmek ya da yeniden yazmak için kullanılır

    public void breathe() {

        System.out.println("Kuş nefes alıyor..");
        super.breathe(); //super extend edilen classı ifade eder (Animal'daki breathi çalıştır)
    }
}

