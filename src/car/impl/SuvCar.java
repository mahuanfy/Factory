package car.impl;

import car.Car;
public class SuvCar implements Car {
    @Override
    public void fill() {
        System.out.println("制造一个SUV汽车");
    }
}
