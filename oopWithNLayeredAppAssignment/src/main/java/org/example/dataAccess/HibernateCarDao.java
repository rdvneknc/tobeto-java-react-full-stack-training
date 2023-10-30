package org.example.dataAccess;

import org.example.entities.Bmw;
import org.example.entities.Car;
import org.example.entities.Mercedes;
import org.example.entities.Renault;

public class HibernateCarDao implements CarDao {


        public void add(Car car){

            System.out.println("Hibernate ile veri tabanına eklendi!");

        }

        public void add(Bmw bmw){

            System.out.println("Hibernate ile veri tabanına eklendi!");

        }

        public void add(Mercedes mercedes){

            System.out.println("Hibernate ile veri tabanına eklendi!");

        }

        public void add(Renault renault){

            System.out.println("Hibernate ile veri tabanına eklendi!");

        }




}
