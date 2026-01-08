import java.util.Scanner;
public class Practical6{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("\nBhoomika Maheshwari");
	System.out.println("Enrollment No.: 240390107020\n");
	System.out.println("Enter an 5 Digit No.: ");
	
	String a = sc.next(); //We use String not int to take each digit(Character) for count and add.
	System.out.println("Your New 5 Digit No.: ");
	
	//a.length() is used to count the Digits in given Number by user
	for(int i=0 ; i < a.length(); i++){
		
		int digit = a.charAt(i) - '0';  /*a.charAt(i) gives the ASCI Value of digit so to convert it 
		in original digit we Subtract ASCI value of 0. for Ex. 5= 53(ASCI Value) 
		so 5-0 = 53-48 gives the real digit 5 */
		
		digit = digit + 1;
		if(digit == 10){
			digit = 0;
		}
		
		System.out.print(digit);
		}
	}
}

