
/**
 * Created by willhorton on 2/1/16.
 */
public class CheckingAccount extends Account {

    public CheckingAccount(String customerName) {
            this.customerName = customerName;
    }

    public double debit(double amount) {

        double withDrawal = 0;

        if(accountBalance - amount >= 0) {
            accountBalance -= amount;
            withDrawal = amount;
            System.out.println("Transaction successful");
        } else {
            System.out.println("Insufficient funds in account. Must have more than $0 in a checking account.");
        }

        return withDrawal;

    }

}
