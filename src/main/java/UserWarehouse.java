import java.lang.reflect.Array;
import java.util.ArrayList;

public class UserWarehouse {
    private static ArrayList<User> users = new ArrayList<User>();

    public static void add(User user) {

        users.add(user);
    }

}
