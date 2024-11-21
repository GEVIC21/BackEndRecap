package presentation;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation {
    public static void main(String[] args) {
//        DaoImpl dao = new DaoImpl();
//        MetierImpl metier = new MetierImpl();
//        metier.setDao(dao);
//        System.out.println(metier.calcul());

        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassname = scanner.next();
            String metierClassName = scanner.next();
//            System.out.println(daoClassname);
//            System.out.println(metierClassName);

            Class cDao= Class.forName(daoClassname);
            IDao dao = (IDao) cDao.newInstance();
//            System.out.println(dao.getData());

            Class cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.newInstance();

            Method m1 = cMetier.getMethod("setDao", new Class[]{IDao.class});
            m1.invoke(metier, new Object[]{dao});

            System.out.println(metier.calcul());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
