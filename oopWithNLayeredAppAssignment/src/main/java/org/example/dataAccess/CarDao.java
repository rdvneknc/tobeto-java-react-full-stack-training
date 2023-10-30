package org.example.dataAccess;

import org.example.entities.Bmw;
import org.example.entities.Car;
import org.example.entities.Mercedes;
import org.example.entities.Renault;

public interface CarDao {

    void add(Car car);
    void add(Mercedes mercedes);
    void add(Bmw bmw);
    void add(Renault renault);

}
