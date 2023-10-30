package org.example.business;

import org.example.core.logging.Logger;
import org.example.dataAccess.CarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;
import org.example.entities.Renault;

public class CarOrderManager {
    private CarDao carDao;
    private Logger[] loggers;

    public CarOrderManager(CarDao carDao, Logger[] loggers) {
        this.carDao = carDao;
        this.loggers = loggers;
    }

    public void add(Car car) throws Exception{

        if (car.getCarYear() <= 2020) {
            throw new Exception("2020 ve öncesi model araçların satışı yapılmamaktadır! Lütfen daha üst modelleri deneyiniz!");
        }

        carDao.add(car);

        for (Logger logger: loggers) {
            logger.log(car.getCarModel());
            logger.log(car.getCarPrice());
            logger.log(car.getCarYear());
            logger.log(car.getCarColor());

        }
    }

    public void add(Renault renault) throws Exception{

        System.out.println(renault.getHorsePower() + " Beygir GÜCÜÜÜÜÜÜ");
        if (renault.getHorsePower() <= 100){
            throw new Exception("Beygir gücü 100 veya daha aşağısında olamaz!");
        }


    }




}
