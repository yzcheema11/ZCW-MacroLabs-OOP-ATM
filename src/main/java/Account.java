import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private static ArrayList<Account> account = new ArrayList<Account>();
    public static int accountCounter;

    private int acctNumber;
    private String type;
    private double balance;
    private double deposit;
    private double withdraw;


    Account(String type){
        this.acctNumber = 1;//Account.accountCounter++;
        this.type = type;
        this.balance = 0;

    }
    public static void mainMenu(){
        Scanner choice = new Scanner(System.in);
        System.out.println("Main Menu:\nWhat would you like to do?\n\n1. Deposit\n2. Withdraw");

    }

    public double setDeposit(){
        return deposit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(int acctNumber) {
        this.acctNumber = acctNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
