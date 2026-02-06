import java.util.Scanner;
class BankAccount {

    String accountId;
    String accountHolderName;
    double balance;

    void assignValues() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account ID: ");
        accountId = sc.nextLine();

        System.out.print("Enter Holder Name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
        sc.nextLine();
    }

    void displayValues() {
        System.out.println("ID: " + accountId +
                " | Name: " + accountHolderName +
                " | Balance: " + balance);
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("\nBhoomika Maheshwari");
		System.out.println("Enrollment No. : 240390107020\n");
        
        BankAccount[] acc = new BankAccount[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for account " + (i + 1));
            acc[i] = new BankAccount();
            acc[i].assignValues();
        }

        System.out.println("\nAll Accounts:");
        for (int i = 0; i < 3; i++) {
            acc[i].displayValues();
        }

        System.out.print("\nEnter account ID to search it: ");
        String searchId = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < 3; i++) {
            if (acc[i].accountId.equals(searchId)) {
                System.out.println("\nAccount Found:");
                acc[i].displayValues();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found!");
        }
    }
}