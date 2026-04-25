import java.util.Scanner;

interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

abstract class PartialOrder implements Order {

    String item;
    int qty;
    int orderId = 101;

    public void placeOrder(String item, int qty) {
        this.item = item;
        this.qty = qty;
        System.out.println("Order Placed. Order ID: " + orderId);
    }
}

class FinalOrder extends PartialOrder {

    public void cancelOrder(int orderId) {
        if (this.orderId == orderId)
            System.out.println("Order Cancelled");
        else
            System.out.println("Invalid Order ID");
    }

    public void generateBill() {
        int price = 100;
        int total = qty * price;

        System.out.println("\nBill Details");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Amount: " + total);
    }
}

public class Practical29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FinalOrder f = new FinalOrder();
		
		System.out.print("\nBhoomika Maheshwari");
		System.out.println("\nEnrollment Number: 240390107020\n");

        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        f.placeOrder(item, qty);

        System.out.println("\n1. Generate Bill");
        System.out.println("2. Cancel Order");

        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        if (ch == 1) {
            f.generateBill();
        } else if (ch == 2) {
            System.out.print("Enter Order ID: ");
            int id = sc.nextInt();
            f.cancelOrder(id);
        } else {
            System.out.println("Invalid choice");
        }
    }
}