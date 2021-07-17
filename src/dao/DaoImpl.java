package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        /* Je me connecte à la DB pour récuperer une valeur*/
        double data=100;
        return data;
    }
    public void init(){
        System.out.println("Instanciation de Dao Impl");
    }
}
