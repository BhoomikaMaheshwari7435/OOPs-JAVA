import java.util.Scanner;
class Point{

    int x, y;
    Point() {
        x = 5;
        y = 5;
    }
    Point(int a, int b) {
        x = a;
        y = b;
    }
    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    void display() {
        System.out.println("Point : (" + x + ", " + y + ")");
    }


    public static void main(String[] args) {
		System.out.println("\nBhoomika Maheshwari");
		System.out.println("Enrollment No. : 240390107020\n");
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point();

        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();

        Point p2 = new Point(x, y);

        Point p3 = new Point(p2);

        System.out.println("\nDefault Constructor:");
        p1.display();
        System.out.println("Parameterized Constructor:");
        p2.display();
        System.out.println("Now Using Copy Constructor:");
        p3.display();
    }
}
