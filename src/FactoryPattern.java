import car.Car;
import car.impl.MpvCar;
import car.impl.SuvCar;
import dao.CarDao;
import dao.impl.CarImpl;
import engine.Engine;
import engine.impl.Natural;
import engine.impl.Turbo;
import factory.AbstractFactory;
import factory.Impl.CarFactory;
import factory.Impl.EngineFactory;

import java.util.Scanner;

public class FactoryPattern {
    private static final String ZERO = "0";
    private static final String ONE = "1";
    private static final String TWO = "2";

    public static void main(String[] args) {

        showMeneInfo();
    }

    public static void showMeneInfo() {
        CarDao carDao = new CarImpl();
        Scanner input = new Scanner(System.in);
        System.out.println("*************************************************");
        System.out.println("***             【目前的汽车数量】                ***");
        System.out.println("***              SUV汽车数量:" + carDao.findCarByName("SUV汽车") + "辆                ***");
        System.out.println("***              MPV汽车数量:" + carDao.findCarByName("MPV汽车") + "辆                ***");
        System.out.println("*************************************************");
        System.out.println("***             【目前的发动机数量】              ***");
        System.out.println("***              涡轮增压发动机:" + carDao.findEngineByName("涡轮增压") + "个              ***");
        System.out.println("***              自然吸气发动机:" + carDao.findEngineByName("自然吸气") + "个              ***");
        System.out.println("*************************************************");
        System.out.println("***                 【主菜单】                  ***");
        System.out.println("***             1.发动机工厂创建发动机            ***");
        System.out.println("***             2.汽车工厂创建汽车               ***");
        System.out.println("***             0.退出                         ***");
        System.out.println("*************************************************");
        System.out.println("***请选择");
        String menu = inputMenu(input);

        if (ONE.equals(menu)) {
            createEngin();

            String enginMenu = inputMenu(input);
            addEngin(enginMenu);

        } else if (TWO.equals(menu)) {
            creatCar();
            String carMenu = inputMenu(input);
            addCar(carMenu);
        }

    }

    public static String inputMenu(Scanner input) {
        String menu = "";
        do {
            menu = menu(input);
            if (ZERO.equals(menu)) {
                System.out.println("***成功退出");
                return null;
            }
            if (!ONE.equals(menu) && !TWO.equals(menu)) {
                System.out.println("***输入不正确请重新输入");
            }
        } while (!ONE.equals(menu) && !TWO.equals(menu));
        return menu;
    }

    public static String menu(Scanner input) {

        return input.next();
    }

    public static void creatCar() {
        System.out.println("*************************************************");
        System.out.println("***                【制造汽车】                 ***");
        System.out.println("***             1.创建一个SUV汽车          ***");
        System.out.println("***             2.创建一个MPV汽车          ***");
        System.out.println("*************************************************");
        System.out.println("***请选择");
    }

    public static void createEngin() {
        System.out.println("*************************************************");
        System.out.println("***               【创建发动机】                ***");
        System.out.println("***             1.创建一个涡轮增压发动机          ***");
        System.out.println("***             2.创建一个自然吸气发动机          ***");
        System.out.println("*************************************************");
        System.out.println("***请选择");
    }

    public static void addEngin(String enginMenu) {
        AbstractFactory engineFactory = new EngineFactory();
        if (ONE.equals(enginMenu)) {
            Engine turbo = engineFactory.getClass(Turbo.class);
            turbo.manufacture();
        } else if (TWO.equals(enginMenu)) {
            Engine natural = engineFactory.getClass(Natural.class);
            natural.manufacture();
        }
        showMeneInfo();
    }

    public static void addCar(String carMenu) {
        AbstractFactory carFactory = new CarFactory();
        if (ONE.equals(carMenu)) {
            Car suvCar = carFactory.getClass(SuvCar.class);
            suvCar.createCar();
        } else if (TWO.equals(carMenu)) {
            Car mpvCar = carFactory.getClass(MpvCar.class);
            mpvCar.createCar();
        }
        showMeneInfo();
    }
}
