package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
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
