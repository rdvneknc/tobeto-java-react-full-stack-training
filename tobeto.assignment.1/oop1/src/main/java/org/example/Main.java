package org.example;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Fakir Coffee Machine");
        product1.setUnitPrice(7500);
        product1.setDiscount(5);
        product1.setUnitsInStock(3);
        product1.setImageUrl("unknown.jpg");


        Product product2 = new Product();
        product2.setName("Samsung Coffee Machine");
        product2.setUnitPrice(8500);
        product2.setDiscount(5);
        product2.setUnitsInStock(5);
        product2.setImageUrl("unknown1.jpg");


        Product product3 = new Product();
        product3.setName("Apple Coffee Machine");
        product3.setUnitPrice(9500);
        product3.setDiscount(5);
        product3.setUnitsInStock(7);
        product3.setImageUrl("unknown2.jpg");


        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (Product product: products) {
            System.out.println("<li>" + product.getName() + " - " + product.getUnitPrice() + " TL" + "</li>");

        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("71452");
        individualCustomer.setPhone("+905556664422");
        individualCustomer.setFirstName("Nicholas");
        individualCustomer.setLastName("Latifi");


        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Williams Racing");
        corporateCustomer.setTaxNumber("123456789");
        corporateCustomer.setCustomerNumber("59882");

        Customer[] customers = {individualCustomer, corporateCustomer};
    }


}
