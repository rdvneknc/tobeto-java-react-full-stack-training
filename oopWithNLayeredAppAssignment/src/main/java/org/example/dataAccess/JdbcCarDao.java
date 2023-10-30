package org.example.dataAccess;

import org.example.entities.Bmw;
import org.example.entities.Car;
import org.example.entities.Mercedes;
import org.example.entities.Renault;

public class JdbcCarDao implements CarDao {

    public void add(Car car){

        System.out.println("JDBC ile veri tabanına eklendi!");

    }

    public void add(Bmw bmw){

        System.out.println("JDBC ile veri tabanına eklendi!");

    }

    public void add(Mercedes mercedes){

        System.out.println("JDBC ile veri tabanına eklendi!");

    }

    public void add(Renault renault){

        System.out.println("JDBC ile veri tabanına eklendi!");

    }

}
