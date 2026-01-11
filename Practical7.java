import java.util.Scanner;
public class Practical7{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("\nBhoomika Maheshwari");
	System.out.println("Enrollment No.: 240390107020\n");
	
	System.out.println("Enter The 3 Sides Of Triangle: ");
	System.out.print("A: ");
	int a = sc.nextInt();
	System.out.print("B: ");
	int b = sc.nextInt();
	System.out.print("C: ");
	int c = sc.nextInt();
	
		if(a+b > c && b+c > a && a+c > b){
			int s = ((a+b+c)/2);
			double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
			System.out.print("The Area Of the Triangle: " + area);
		}
		
		else{
			System.out.print("The Given Side Does Not Made Triangle.");
		}
	
	}

}