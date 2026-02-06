import java.util.Scanner;
class LoanCalculator {

    void calculateEMI(int principal, int time, float rate) {
        float si = (principal * rate * time) / 100;
        float total = principal + si;
        float emi = total / (time * 12);
        System.out.println("Home Loan EMI = " + emi);
    }
    void calculateEMI(double principal, int time, double rate) {
        double si = (principal * rate * time) / 100;
        double total = principal + si;
        double emi = total / (time * 12);
        System.out.println("Vehicle Loan EMI = " + emi);
    }
    void calculateEMI(int principal, int time) {
        float rate = 10;

        float si = (principal * rate * time) / 100;
        float total = principal + si;
        float emi = total / (time * 12);
        System.out.println("Personal Loan EMI = " + emi);
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LoanCalculator lc = new LoanCalculator();
		System.out.println("\nBhoomika Maheshwari");
		System.out.println("Enrollment No. : 240390107020\n");
		
		System.out.print("Home Loan : ");
		lc.calculateEMI(250000,8,4);
        System.out.println("Select Loan Type:");
        System.out.println("1. Home Loan");
        System.out.println("2. Vehicle Loan");
        System.out.println("3. Personal Loan");

        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        System.out.print("Enter Principal amount: ");
        int p = sc.nextInt();

        System.out.print("Enter Time (years): ");
        int t = sc.nextInt();

        if (ch == 1) {
            System.out.print("Enter Rate: ");
            float r = sc.nextFloat();
            lc.calculateEMI(p, t, r);
        }
        else if (ch == 2) {
            System.out.print("Enter Rate: ");
            double r = sc.nextDouble();
            lc.calculateEMI((double)p, t, r);
        }
        else if (ch == 3) {
            lc.calculateEMI(p, t);
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}