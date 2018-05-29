package car.impl;

import car.Car;

public class MpvCar implements Car{
    @Override
    public void fill() {
        System.out.println("制造一个mpv汽车");
    }
}
