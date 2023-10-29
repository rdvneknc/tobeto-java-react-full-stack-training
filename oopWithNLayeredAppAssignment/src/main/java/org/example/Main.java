package org.example;

import org.example.business.CarOrderManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Bmw;
import org.example.entities.Car;
import org.example.entities.Mercedes;


public class Main {
    public static void main(String[] args) throws Exception {

        Car car1 = new Car("Fiat Egea", 9000, 2022, "Yellow" );
        Car car2 = new Car("Volvo", 37000, 2023, "Metallic Gray");

        Bmw bmw1 = new Bmw("X5", 55000,2022, "Black", "Amsterdam");
        Bmw bmw2 = new Bmw("5.25 X-Drive", 35000,2021,"White", "Berlin");

        Mercedes mercedes1 = new Mercedes("AMG", 60000, 2023, "Black", "Steel");
        Mercedes mercedes2 = new Mercedes("SL", 54000, 2023, "Gray", "Titanium");



        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        CarOrderManager carOrderManager = new CarOrderManager(new HibernateCarDao(), loggers);
        carOrderManager.add(car1);
        carOrderManager.add(car2);

    }
}