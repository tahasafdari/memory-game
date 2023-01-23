import Database.dao.IMemoryGameDAO;
import Database.dao.MemoryGameDAO;
import Database.datasource.SqlJpaConn;
import Database.entity.Account;
import Model.*;
import jakarta.persistence.EntityManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //User ja hänen tuloslistansa haetaan oikeassa versiossa databasesta sovelluksen käynnistyttyä.
        ArrayList<Integer> tuloslista = new ArrayList<>();
        IUser user = new Model.User("kalle",1,tuloslista);
        user.addScore(3500);
        user.addScore(1200);

        System.out.println(user + "\n");

        IEngine engine = new Engine(ModeType.EASY);
        engine.setMemoryObjects();

        System.out.println(engine + "\n");

        for(MemoryObject object: engine.getSuffledObjects()) {

            System.out.println(
            "Palikan id-numero: " + object.getIdNumber() +
            ", Onko aktiivinen: " + object.isActive()
            );
        }

        //tessstti
        EntityManager em = SqlJpaConn.getInstance();
        IMemoryGameDAO dao = new MemoryGameDAO();
        Account account = new Account("toni", "tiikeri");

        dao.saveUser(account);

        System.out.println("done");

    }



}