import java.util.Scanner;

public class Console {

    Scanner sc = new Scanner(System.in);


    public String getWelcomeMessage() {
        String message = "Welcome to the Zip Code Bank!\n"
                + "\nIf you currently have an account with us, please input 1!\n"
                + "\nIf you would like to create and account with us, please input 5!\n"
                + "\n*** If your name is Tariq, please leave! ***";
        return message;
    }

    public void printWelcomeMessage(){
        System.out.println(getWelcomeMessage());
    }


    public void inputMessage(){

        String option = sc.nextLine();

        if (option.equals("1")) {
            System.out.println("Please enter your Username below:");
            String username = sc.next();

        } else if (option.equals("5")) {
            UserFactory.createUser();
            AccountFactory.userCreateAccount();
        } else {
                System.out.println("Please leave this bank Tariq, you don't qualify for an account here!");
        }

    }
}
