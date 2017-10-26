import org.junit.Assert;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void acctNumberTest() {
        //: Given
        Account testAcctNumber = new Account("");
        int expected = 1;

        //: When
        int actual = testAcctNumber.getAcctNumber();

        //: Then
        Assert.assertEquals(expected, actual);
    }


}