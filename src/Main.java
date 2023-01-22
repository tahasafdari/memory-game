import Model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //User ja hänen tuloslistansa haetaan oikeassa versiossa databasesta sovelluksen käynnistyttyä.
        ArrayList<Integer> tuloslista = new ArrayList<>();
        IUser user = new User("kalle",1,tuloslista);
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


    }
}