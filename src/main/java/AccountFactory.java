import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountFactory {
    private static ArrayList<Account> account = new ArrayList<Account>();
    static Scanner scanner = new Scanner(System.in);

    public static void userCreateAccount() {

        System.out.println("\nWhat type of account would you like to open with Zip Code Bank?\n"
                +"\n1. Checking Account\n2. Savings Account\n3. Investment Account\n");
        String type = scanner.nextLine();
        createAccount(type);
    }


    public static void createAccount(String type){
        System.out.println("Creating a new account...");
        Account account = new Account(type);
        AccountWarehouse.add(account);

    }
}
