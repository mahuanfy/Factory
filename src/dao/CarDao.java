package dao;

public interface CarDao {
    Integer findCarByName(String name);

    Integer findEngineByName(String name);

    void updateEngineByName(String name);

    void updateCarByName(String name);
}
