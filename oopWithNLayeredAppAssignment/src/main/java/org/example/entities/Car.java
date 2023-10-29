package org.example.entities;

public class Car {

    private String carModel;
    private double carPrice;
    private int carYear;
    private String carColor;


    public Car(String carModel, double carPrice, int carYear, String carColor) {
        this.carModel = carModel;
        this.carPrice = carPrice;
        this.carYear = carYear;
        this.carColor = carColor;
    }


    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
