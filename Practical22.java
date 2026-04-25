/* Design a base class Shape with two double data members’ d1 and d2 to store dimensions. Include a method 
getData (double d1, double d2) to initialize these dimensions. Create two derived classes, Triangle and Rectangle, 
which inherit from Shape. Each derived class should have its own method to calculate its specific area. */

import java.util.Scanner;
class Shape {

    double d1, d2;

    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {

    double area() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {

    double area() {
        return d1 * d2;
    }
}

public class Practical22 {
    public static void main(String[] args) {

		System.out.print("\nBhoomika Maheshwari");
		System.out.println("\nEnrollment Number: 240390107020\n");
		
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();

        t.getData(10, 5);
        r.getData(10, 5);

        System.out.println("Triangle Area = " + t.area());
        System.out.println("Rectangle Area = " + r.area());
    }
}