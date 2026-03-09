import java.util.Scanner;

class VolumeCalculator {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(double radius, boolean sphere) {
        return (4.0 / 3.0) * 3.14 * radius * radius * radius;
    }
}

public class Practical21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VolumeCalculator v = new VolumeCalculator();

        System.out.println("1. Cube");
        System.out.println("2. Rectangular Cube");
        System.out.println("3. Sphere");

        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        if (ch == 1) {
            System.out.print("Enter side: ");
            double side = sc.nextDouble();
            System.out.println("Volume = " + v.calculateVolume(side));
        }

        else if (ch == 2) {
            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter width: ");
            double w = sc.nextDouble();
            System.out.print("Enter height: ");
            double h = sc.nextDouble();
            System.out.println("Volume = " + v.calculateVolume(l, w, h));
        }

        else if (ch == 3) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            System.out.println("Volume = " + v.calculateVolume(r, true));
        }

        else {
            System.out.println("Invalid choice");
        }
    }
}