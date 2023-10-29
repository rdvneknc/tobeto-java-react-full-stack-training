package org.example;

import org.example.business.CarOrderManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;


public class Main {
    public static void main(String[] args) throws Exception {

        Car car1 = new Car("BMW", 40000, 2023, "Yellow" );
        Car car2 = new Car("Volvo", 37000, 2023, "Metallic Gray");

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        CarOrderManager carOrderManager = new CarOrderManager(new HibernateCarDao(), loggers);
        carOrderManager.add(car1);
        carOrderManager.add(car2);
    }
}