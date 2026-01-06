import java.util.Scanner;

public class Practical2
{
    public static void main(String args[])
    {
        Scanner s1 = new Scanner(System.in);

        double a, b, c, d, e, f;
        double D, Dx, Dy, x, y;
		
		System.out.println("Enter Value of a: ");
		a=s1.nextDouble();
		
		System.out.println("Enter Value of b: ");
		b=s1.nextDouble();
		
		System.out.println("Enter Value of c: ");
		c=s1.nextDouble();
		
		System.out.println("Enter Value of d: ");
		d=s1.nextDouble();
		
		System.out.println("Enter Value of e: ");
		e=s1.nextDouble();
		
		System.out.println("Enter Value of f: ");
		f=s1.nextDouble();
		
		D=a*d - b*c;
		Dx = e*d - b*f;
		Dy = a*f - c*e;
		
		x= Dx/D;
		y= Dy/D;
		
		System.out.println("x= "+ x);
		System.out.println("y= "+ y);
	
	}	
}