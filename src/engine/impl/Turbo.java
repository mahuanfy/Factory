package engine.impl;

import dao.CarDao;
import dao.impl.CarImpl;
import engine.Engine;

/**
 * 涡轮增压发动机
 */
public class Turbo implements Engine {
    CarDao carDao = new CarImpl();
    @Override
    public void manufacture() {
        carDao.updateEngineByName("涡轮增压");
        System.out.println("***git成功创建1个涡轮增压的发动机");
    }
}
