import java.util.Scanner;
class BillGenerator {

    void generateBill(int itemTotal) {
        System.out.println("Final Bill Amount = " + itemTotal);
    }

    void generateBill(int itemTotal, int discount) {
        int finalBill = itemTotal - discount;
        System.out.println("Final Bill Amount = " + finalBill);
    }

    void generateBill(int itemTotal, double discountPercent) {
        double finalBill = itemTotal - (itemTotal * discountPercent / 100);
        System.out.println("Final Bill Amount = " + finalBill);
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.println("\nBhoomika Maheshwari");
		System.out.println("Enrollment No. : 240390107020\n");
        
        BillGenerator b = new BillGenerator();

        System.out.println("1. Regular Customer");
        System.out.println("2. Privileged Customer");
        System.out.println("3. Festive Offer");

        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();

        System.out.print("Enter Total Bill: ");
        int total = sc.nextInt();

        if (ch == 1) {
            b.generateBill(total);
        }
        else if (ch == 2) {
            System.out.print("Enter Flat Discount: ");
            int dis = sc.nextInt();
            b.generateBill(total, dis);
        }
        else if (ch == 3) {
            System.out.print("Enter Discount Percent: ");
            double per = sc.nextDouble();
            b.generateBill(total, per);
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
}