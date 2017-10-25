import java.util.ArrayList;

public class User {

    private String username;
    private String password;
    private ArrayList<Account> accounts;

    public User(String username, String password){}

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(String username) {
        return this.username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }


    }

