package Reiziger;
import java.util.List;

interface ReizigerDAO{

    List<Reiziger> findAll();
    List<Reiziger> findById();
    List<Reiziger> findByName();
    boolean insert(Reiziger reiziger);
    boolean update(Reiziger reiziger);
    boolean delete(Reiziger reiziger);
    boolean save(Reiziger reiziger);
}