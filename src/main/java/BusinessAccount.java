
/**
 * Created by willhorton on 2/1/16.
 */
public class BusinessAccount extends Account {

    public BusinessAccount(String customerName) {
        this.customerName = customerName;
    }

    public double debit(double amount) {

        double withDrawal = 0;

        if(accountBalance - amount >= 0) {
            accountBalance -= amount;
            withDrawal = amount;
            System.out.println("Transaction successful.");
        }
        else if(accountBalance - amount >= -200) {
            accountBalance -= amount;
            withDrawal = amount;
            System.out.printf("Your overdraft protection has covered this transaction");
        } else {
            System.out.println("Insufficient funds in account, must maintain a minimum of $200 in a savings account");
        }

        return withDrawal;

    }

}