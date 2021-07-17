package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao;
    @Override
    public double calcul() {
        double d=dao.getData();
        double res=d*23;
        return res;
    }

    public MetierImpl() {
        System.out.println("Instanciation de Metier");
    }

    public void init(){
        System.out.println("Initialisation de Metier Impl");
    }

    public void setDao(IDao dao) {
        this.dao = dao;
        System.out.println("Injection de dependance");
    }
}
