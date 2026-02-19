class bankAccount {

    String account_holder_name;
    double balance;
    static double interest_rate;

    // Static block
    static {
		System.out.println("\nBhoomika Maheshwari");
		System.out.println("240390107020\n");
		
        interest_rate = 15.0;
        System.out.println("Static Block Executed and Interest Initialized.");
    }

    // Constructor
    bankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    double calculateInterest() {
        return (balance * interest_rate / 100);
    }

    void displayInterest() {
        System.out.println("Account Holder Name : " + account_holder_name);
        System.out.println("Balance : " + balance);
        System.out.println("Interest Rate : " + interest_rate + "%");
        System.out.println("Interest Earned : " + calculateInterest());
        System.out.println("--------------------------------------");
    }

    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("Interest Rate Updated : " + newRate + "%");
    }

    public static void main(String[] args) {

        bankAccount acc1 = new bankAccount("Bhoomi Maheshwari", 50000);
        bankAccount acc2 = new bankAccount("Riddhi Sadhu", 40000);

        System.out.println("Values before Interest Updated.");
        acc1.displayInterest();
        acc2.displayInterest();

        System.out.println("Interest Earned After Interest is Updated");
        updateInterestRate(20);

        acc1.displayInterest();
        acc2.displayInterest();
    }
}