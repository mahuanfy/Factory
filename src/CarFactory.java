import car.Car;

/**
 * 汽车组装
 */
public class CarFactory implements AbstractFactory{
    Car obj = null;
    @Override
    public Car getClass(Class clazz){
        try {
            obj = (Car) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
    public void fill(){
        this.obj.fill();
    }
}
