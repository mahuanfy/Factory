package engine.impl;

import dao.CarDao;
import dao.impl.CarImpl;
import engine.Engine;

/**
 * 自然吸气发动机
 */
public class Natural implements Engine {
    CarDao carDao = new CarImpl();

    @Override
    public void manufacture() {
        carDao.updateEngineByName("自然吸气");
        System.out.println("***成功创建1个自然吸气发动机");
    }
}
