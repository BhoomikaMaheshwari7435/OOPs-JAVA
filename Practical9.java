import java.util.Scanner;
class Rectangle{
	double hight, width;
	Rectangle(){
		width = 1;
		hight = 1;
	}
	Rectangle(double w, double h){
		width = w;
		hight = h;
	}
	void getArea(){
		System.out.println("The Area Of Rectangle : "+(width*hight));
	}
	void getPerameter(){
		System.out.println("The Perameter of Rectangle : "+ 2*(width+hight));
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nBhoomika Maheshwari");
		System.out.println("240390107020\n");
		Rectangle rec = new Rectangle();
		rec.getArea();
		rec.getPerameter();
		
		rec = new Rectangle(16,17);
		rec.getArea();
		rec.getPerameter();
		
		System.out.println("Enter Value of a & b : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		rec = new Rectangle(a,b);
		rec.getArea();
		rec.getPerameter();
	}
	
	
	
}