import java.util.Scanner;

class Payment {

    void processPayment(int amount) {
        System.out.println("Processing payment of Rs. " + amount);
    }
}

class CreditCardPayment extends Payment {

    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done Using Credit Card");
    }
}

class UPIPayment extends Payment {

    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using UPI");
    }
}

public class Practical26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		System.out.print("\nBhoomika Maheshwari");
		System.out.println("\nEnrollment Number: 240390107020\n");
		
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");

        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        Payment p;

        if (ch == 1) {
            p = new CreditCardPayment();
        } else if (ch == 2) {
            p = new UPIPayment();
        } else {
            System.out.println("Invalid choice");
            return;
        }

        p.processPayment(amount);
    }
}