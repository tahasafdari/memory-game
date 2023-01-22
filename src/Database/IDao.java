package Database;

import Model.User;

import java.util.ArrayList;

public interface IDao {

    void saveUser(User user);
    User readUser(Integer id);
    void saveScores(User user);
    ArrayList<Integer> readUserScores(Integer id);

    ArrayList<Integer> readWorldScores();
}
