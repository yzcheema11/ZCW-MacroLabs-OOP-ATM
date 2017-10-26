import java.util.Scanner;

public class UserFactory {
    static Scanner scanner = new Scanner(System.in);

    public static void createUser() {
        System.out.println("Please enter your new account details below:\n");
        System.out.println("New Username:");
        String username = scanner.nextLine();

        System.out.println("\nNew Password:");
        String password = scanner.nextLine();

        System.out.println("Creating a new user...");
        User user = new User(username, password);
        UserWarehouse.add(user);
    }





}
