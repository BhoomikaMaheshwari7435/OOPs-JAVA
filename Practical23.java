/* Define a base class BankAccount with common attributes like accountNumber, accountHolderName, and balance. 
Then, define two subclasses: SavingAccount an  FixedDepositAccount, which inherit from BankAccount. 
Implement basic operations like openAccount(), deposit(), checkBalance (), and withdraw() in BankAccount. 
The SavingAccount should include a calculateInterest() method specific to savings accounts, and FixedDepositAccount 
should have a maturityAmount() method considering fixed deposit terms. */


import java.util.Scanner;
class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;

    void openAccount() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void checkBalance() {
        System.out.println("Balance = " + balance);
    }
}

class SavingAccount extends BankAccount {

    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Interest = " + interest);
    }
}

class FixedDepositAccount extends BankAccount {

    void maturityAmount(int years) {
        double rate = 0.07;
        double amount = balance + (balance * rate * years);
        System.out.println("Maturity Amount = " + amount);
    }
}

public class Practical23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		System.out.print("\nBhoomika Maheshwari");
		System.out.println("\nEnrollment Number: 240390107020\n");
        System.out.println("1. Saving Account");
        System.out.println("2. Fixed Deposit Account");

        System.out.print("Enter choice: ");
        int ch = sc.nextInt();
        sc.nextLine();

        if (ch == 1) {

            SavingAccount s = new SavingAccount();
            s.openAccount();

            System.out.print("Enter deposit amount: ");
            double d = sc.nextDouble();
            s.deposit(d);

            System.out.print("Enter withdraw amount: ");
            double w = sc.nextDouble();
            s.withdraw(w);

            s.checkBalance();
            s.calculateInterest();
        }

        else if (ch == 2) {

            FixedDepositAccount f = new FixedDepositAccount();
            f.openAccount();

            System.out.print("Enter years: ");
            int y = sc.nextInt();

            f.checkBalance();
            f.maturityAmount(y);
        }

        else {
            System.out.println("Invalid choice");
        }
    }
}