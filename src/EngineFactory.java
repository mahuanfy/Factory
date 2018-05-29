import engine.Engine;

/**
 * Created by 马欢欢 on 2018/3/15.
 */
public class EngineFactory implements AbstractFactory{
    Engine obj = null;
    @Override
    public Engine getClass(Class clazz){
        try {
            obj = (Engine) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
    public void manufacture() {
        this.obj.manufacture();
    }
    
}
