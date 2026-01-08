import java.util.Scanner;
public class Practical1{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("\nBhoomika Maheshwari");
	System.out.println("Enrollment No.: 240390107020\n");
	System.out.println("Enter The Meters To Convert: ");
	double meter = sc.nextDouble();
	
	double feet = meter * 3.28084;
	
	System.out.printf("Converted Feet: %.3f ", feet);
	sc.close();
	
	}

}

