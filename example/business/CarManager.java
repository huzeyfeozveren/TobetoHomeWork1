package org.example.business;

import org.example.dataAccess.CarDao;
import org.example.entities.Car;

public class CarManager {
    private CarDao carDao;

    public CarManager(CarDao carDao){
        this.carDao = carDao;
    }
    public void add(Car car) throws Exception{
        //iş kuralları
        if(car.getYear()<2020){
            throw new Exception("2020 yılından eski araçlar uygun değildir.");
        }
        carDao.add(car);

        System.out.println(car.getYear() + " model " + car.getName() + " marka aracın fiyatı: " + car.getUnitPrice() +" $ ");
    }
}

