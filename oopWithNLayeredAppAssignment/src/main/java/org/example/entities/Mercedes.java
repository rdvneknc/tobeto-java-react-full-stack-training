package org.example.entities;

public class Mercedes extends Car{
    private String bumperMaterial;

    public Mercedes(String carModel, double carPrice, int carYear, String carColor, String bumperMaterial) {
        super(carModel, carPrice, carYear, carColor);
        this.bumperMaterial = bumperMaterial;
    }

    public String getBumperMaterial() {
        return bumperMaterial;
    }

    public void setBumperMaterial(String bumperMaterial) {
        this.bumperMaterial = bumperMaterial;
    }
}
