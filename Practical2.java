import java.util.Scanner;

public class Practical2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, e, f;
        double D, Dx, Dy, x, y;

		System.out.println("\nEnrollment No. : 240390107020.");
		System.out.println("Enter Value of a: ");
		a=sc.nextDouble();
		
		System.out.println("Enter Value of b: ");
		b=sc.nextDouble();
		
		System.out.println("Enter Value of c: ");
		c=sc.nextDouble();
		
		System.out.println("Enter Value of d: ");
		d=sc.nextDouble();
		
		System.out.println("Enter Value of e: ");
		e=sc.nextDouble();
		
		System.out.println("Enter Value of f: ");
		f=sc.nextDouble();
		
		D=a*d - b*c;
		Dx = e*d - b*f;
		Dy = a*f - c*e;
		
		x= Dx/D;
		y= Dy/D;
		
		System.out.println("x= "+ x);
		System.out.println("y= "+ y);
	
	}	

}
