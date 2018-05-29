import car.Car;
import car.impl.MpvCar;
import car.impl.SuvCar;
import engine.Engine;
import engine.impl.Natural;
import engine.impl.Turbo;

public class FactoryPattern {

    public static void main(String[] args) {
        AbstractFactory engineFactory = new EngineFactory();
        Engine turbo = engineFactory.getClass(Turbo.class);
        turbo.manufacture();
        Engine natural = engineFactory.getClass(Natural.class);
        natural.manufacture();


        AbstractFactory carFactory = new CarFactory();
        Car suvCar = carFactory.getClass(SuvCar.class);
        suvCar.fill();
        Car mpvCar = carFactory.getClass(MpvCar.class);
        mpvCar.fill();

    }
}
