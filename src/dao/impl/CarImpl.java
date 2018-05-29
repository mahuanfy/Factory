package dao.impl;

import dao.CarDao;
import entity.Car;
import entity.Engine;
import utils.BaseDaoutil;

import java.util.List;

public class CarImpl extends BaseDaoutil implements CarDao {


    @Override
    public Integer findCarByName(String name) {
        String sql = " SELECT * FROM car where name = ? ";
        Object[] num={name};
        List<Car> car =super.query(sql,num,Car.class);
        return car!=null && car.size()>0 ? car.size() : null;
    }

    @Override
    public Integer findEngineByName(String name) {
        String sql = " SELECT * FROM engine where name = ? ";
        Object[] num={name};
        List<Engine> engines =super.query(sql,num, Engine.class);
        return engines!=null && engines.size()>0 ? engines.size() : null;
    }

    @Override
    public void updateEngineByName(String name) {
        String sql = " INSERT INTO engine(name,time) VALUES(?,NOW()); ";
        Object[] num = {name};
        super.update(sql,num);
    }
    @Override
    public void updateCarByName(String name) {
        String sql = " INSERT INTO car(name,time) VALUES(?,NOW()); ";
        Object[] num = {name};
        super.update(sql,num);
    }
}
