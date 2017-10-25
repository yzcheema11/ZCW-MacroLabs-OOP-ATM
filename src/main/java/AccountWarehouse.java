import java.lang.reflect.Array;
import java.util.ArrayList;

public class AccountWarehouse {
    private static ArrayList<Account> accounts = new ArrayList<Account>();

    public static void add(Account account) {
        accounts.add(account);
    }
}
