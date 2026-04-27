class NotSufficientFundException extends Exception {
    NotSufficientFundException(String msg) {
        super(msg);
    }
}

class BankAccount {

    double balance;

    BankAccount() {
        balance = 1000.00;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) throws NotSufficientFundException {

        if (amount > balance) {
            throw new NotSufficientFundException("Not Sufficient Fund");
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Practical36 {
    public static void main(String[] args) {
		
		System.out.print("\nBhoomika Maheshwari");
		System.out.println("\nEnrollment Number: 240390107020\n");

        BankAccount b = new BankAccount();

        b.deposit(1000.00);

        try {
            b.withdraw(400.00);
            b.withdraw(300.00);
            b.withdraw(500.00);
        }
        catch (NotSufficientFundException e) {
            System.out.println(e.getMessage());
        }

        b.displayBalance();
    }
}