import org.junit.jupiter.api.Test;
import org.junit.Assert;


class ConsoleTest {
    @Test
    void welcomeMessage() {
        //: Given
        Console console = new Console();
        String expected = "Welcome to the Zip Code Bank!\n"
                + "\nIf you currently have an account with us, please input 1!\n"
                + "\nIf you would like to create and account with us, please input 5!\n"
                + "\n*** If your name is Tariq, please leave! ***";

        //: When
        String actual = console.getWelcomeMessage();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void inputMessage() {
        //: Given
        //: When
        //: Then

    }

}