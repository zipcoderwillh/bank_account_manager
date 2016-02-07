
/**
 * Created by willhorton on 2/1/16.
 */
public class AccountManager {

    public void transferMoney(double amount, Account sourceAccount, Account destinationAccount) {
        destinationAccount.credit(sourceAccount.debit(amount));
    }

    public void depositMoney(double amount, Account destinationAccount) {
        destinationAccount.credit(amount);
    }

    public void withdrawMoney(double amount, Account sourceAccount) {
        sourceAccount.debit(amount);
    }

    public void printAllBalances(Account savings, Account checking, Account business) {
        System.out.println(savings.getAccountBalance());
        System.out.println(checking.getAccountBalance());
        System.out.println(business.getAccountBalance());
    }

    public static void main(String[] args) {

        AccountManager atm = new AccountManager();

        // Polymophism:
        // Try recasting checking as CheckingAccount vs Account. Very different results.
        // Experiment with adding accountBalance and getAccountBalance() to CheckingAccount as well as Account, then cast it as
        // Account vs. CheckingAccount when instantiating and see what happens--confusing results when accessing the field directly.
        // Important thing to remember is to not access fields directly when possible. Also don't hide/shadow fields in
        // subclasses if possible.

        // Cast as Account
        Account checking = new CheckingAccount("Steve");
        System.out.println(checking.accountBalance);  // 5.0 (Account field)
        System.out.println(checking.getAccountBalance());  // 10.0 (CheckingAccount field)
        checking.accountBalance = 500;
        System.out.println(checking.accountBalance);  // 500.0 (Account field (changed))
        System.out.println(checking.getAccountBalance());  // 10.0 (CheckingAccount field (unchanged))

        System.out.println();

        // Cast as CheckingAccount
        CheckingAccount checking2 = new CheckingAccount("Steve");
        System.out.println(checking2.accountBalance);  // 10.0 CheckingAccount field
        System.out.println(checking2.getAccountBalance());  // 10.0 CheckingAccount field
        checking2.accountBalance = 500;  // CheckingAccount field
        System.out.println(checking2.accountBalance);  // 500.0 CheckingAccount field
        System.out.println(checking2.getAccountBalance());  // 500.0 CheckingAccount field





        /*
        SavingsAccount savings = new SavingsAccount("Steve");
        BusinessAccount business = new BusinessAccount("Steve");

        atm.depositMoney(500, savings);

        atm.printAllBalances(checking, savings, business);

        atm.transferMoney(200, savings, checking);
        atm.withdrawMoney(200, savings);

        atm.printAllBalances(checking, savings, business);

        atm.transferMoney(100, savings, business);

        atm.printAllBalances(checking, savings, business);
        */


    }

}