package car.impl;

import car.Car;
import dao.CarDao;
import dao.impl.CarImpl;

public class MpvCar implements Car{
    CarDao carDao = new CarImpl();
    @Override
    public void createCar() {
        carDao.updateCarByName("MPV汽车");
        System.out.println("***制造1个MPV汽车");
    }
}
