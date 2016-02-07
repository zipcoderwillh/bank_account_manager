
/**
 * Created by willhorton on 2/1/16.
 */
abstract class Account {

    protected double accountBalance = 5;
    protected String customerName;

    public double getAccountBalance(){
        return accountBalance;
    }

    public void credit(double amount) {
        System.out.printf("You deposited $%f\n", amount);
        accountBalance += amount;
    }

    abstract double debit(double amount);

}