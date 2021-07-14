package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args){
        /*
        * Injection des dependances par instanciation dynamique
        * */

        try {
            Scanner scanner=new Scanner(new File("config.txt"));
            String daoClassName=scanner.nextLine();
            Class cDao=Class.forName(daoClassName);
            IDao dao= (IDao) cDao.getConstructor().newInstance();

            String metierClassName=scanner.nextLine();
            Class cMetier=Class.forName(metierClassName);
            IMetier metier=(IMetier) cMetier.getConstructor().newInstance();

            Method method=cMetier.getMethod("setDao",IDao.class);
            method.invoke(metier,dao);
            System.out.println(metier.calcul());
        } catch (FileNotFoundException | ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
