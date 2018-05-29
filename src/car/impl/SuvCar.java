package car.impl;

import car.Car;
import dao.CarDao;
import dao.impl.CarImpl;

public class SuvCar implements Car {
    CarDao carDao = new CarImpl();
    @Override
    public void fill() {
        carDao.updateCarByName("SUV汽车");
        System.out.println("***制造1个SUV汽车");
    }
}
