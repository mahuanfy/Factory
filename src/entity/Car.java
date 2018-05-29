package entity;

import java.util.Date;

public class Car {
    private int id ;
    private String name;
    private String data;
    private int engine_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getEngine_id() {
        return engine_id;
    }

    public void setEngine_id(int engine_id) {
        this.engine_id = engine_id;
    }
}
