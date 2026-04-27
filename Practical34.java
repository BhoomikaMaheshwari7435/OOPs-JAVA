import java.util.Scanner;

class VotingApp {

    void checkEligibility(int age) {

        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        }

        System.out.println("Eligible to vote");
    }
}

public class Practical34 {
    public static void main(String[] args) {
		
		System.out.print("\nBhoomika Maheshwari");
		System.out.println("\nEnrollment Number: 240390107020\n");

        Scanner sc = new Scanner(System.in);
        VotingApp v = new VotingApp();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            v.checkEligibility(age);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Validation process completed");
        }
    }
}