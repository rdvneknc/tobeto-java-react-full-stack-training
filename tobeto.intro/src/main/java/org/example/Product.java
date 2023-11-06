package org.example;

public class Product {

    public Product(String name, double unitPrice){
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public Product(String name)
    {
        this.name = name;
    }

    public Product()
    {
        System.out.println("Yeni bir ürün üretildi..");
    }

    public String name;

    public double unitPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 3)
            return;
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void applyDiscount (double priceToSubstract){
        unitPrice = unitPrice - priceToSubstract;
        System.out.println(name + " ürününe " + priceToSubstract + "TL tutarında indirim uygulanmıştır!");

    }


}
