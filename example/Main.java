package org.example;

import org.example.business.CarManager;
import org.example.dataAccess.CarDao;
import org.example.entities.Car;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws Exception {

        Car car1 = new Car("mercedes",2020,200000);
        Car car2 = new Car("audi",2023,185000);
        Car car3 = new Car("seat",2022,150000);
        Car car4 = new Car("bmw",2019,430000);

        CarManager carManager = new CarManager(new CarDao() {
            @Override
            public void add(Car car) {

            }
        });
        carManager.add(car1);
        carManager.add(car2);
        carManager.add(car3);
        carManager.add(car4);
    }
}