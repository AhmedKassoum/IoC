package extension;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        /*
        Version Web Service
        * */
        System.out.println("Version web service");
        double data=12;
        return data;
    }
}
