package org.example.entities;

public class Renault extends Car {

    private boolean doesItHaveSunroof;
    private int horsePower;


    public Renault(String carModel, double carPrice, int carYear, String carColor, boolean doesItHaveSunroof, int i) {
        super(carModel, carPrice, carYear, carColor);
        this.doesItHaveSunroof = doesItHaveSunroof;
    }

    public boolean isDoesItHaveSunroof() {
        return doesItHaveSunroof;
    }

    public void setDoesItHaveSunroof(boolean doesItHaveSunroof) {
        this.doesItHaveSunroof = doesItHaveSunroof;
    }

    public Renault(String carModel, double carPrice, int carYear, String carColor, int horsePower) {
        super(carModel, carPrice, carYear, carColor);
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

}
