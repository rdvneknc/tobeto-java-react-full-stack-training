package org.example.entities;

public class Bmw extends Car{
    private String chosenServiceLocation;

    public Bmw(String carModel, double carPrice, int carYear, String carColor, String chosenServiceLocation) {
        super(carModel, carPrice, carYear, carColor);
        this.chosenServiceLocation = chosenServiceLocation;
    }

    public String getChosenServiceLocation() {
        return chosenServiceLocation;
    }

    public void setChosenServiceLocation(String chosenServiceLocation) {
        this.chosenServiceLocation = chosenServiceLocation;
    }
}




