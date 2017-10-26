import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UserWarehouse {
    private static ArrayList<User> users = new ArrayList<User>();

    public static void add(User user) {

        users.add(user);
    }
    public static void existingUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Username below:");
        String username = sc.next();
        System.out.println("Please enter your Password below:");
        String password = sc.next();
    }
}
