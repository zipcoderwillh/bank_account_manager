
/**
 * Created by willhorton on 2/2/16.
 */
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by willhorton on 2/2/16.
 */
public class TestBusinessAccount {

    BusinessAccount testAccount;
    BusinessAccount testAccount2;

    @Before
    public void initialize() {
        testAccount = new BusinessAccount("Greg");
        testAccount2 = new BusinessAccount("Steve");
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

    @Test
    public void testMoreDebit() {
        testAccount2.credit(200);
        testAccount2.debit(300.00);
        assertTrue(-95 == testAccount2.getAccountBalance());
    }

}

