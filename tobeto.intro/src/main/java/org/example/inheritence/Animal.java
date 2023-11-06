package org.example.inheritence;

public abstract class Animal { //abstract classlar new edilemezler,


    public abstract void animalSound();
    public void breathe(){
        System.out.println("Animal is breathing..");
    }

    public void eat(){
        System.out.println("Animal is eating..");
    }
}
