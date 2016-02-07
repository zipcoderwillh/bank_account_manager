
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by willhorton on 2/2/16.
 */
public class TestCheckingAccount {

    CheckingAccount testAccount;
    CheckingAccount testAccount2;

    @Before
    public void initialize() {
        testAccount = new CheckingAccount("Greg");
        testAccount2 = new CheckingAccount("Steve");
    }

    @Test
    public void testCredit() {
        testAccount.credit(400.45);
        assertTrue(405.45 == testAccount.getAccountBalance());
    }

    @Test
    public void testDebit() {
        testAccount2.credit(300.00);
        testAccount2.debit(100.05);
        assertTrue(204.95 == testAccount2.getAccountBalance());
    }



}
