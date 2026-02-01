class Rectangle2 {

    double width;
    double height;

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
		System.out.println("\nBhoomika Maheshwari");
		System.out.println("Enrollment No. : 240390107020\n");
        Rectangle2 r1 = new Rectangle2();
        Rectangle2 r2 = new Rectangle2();

        r1.width = 20;
        r1.height = 41;
        r2.width = 3.5;
        r2.height = 43.5;

        System.out.println("Rectangle 1:");
        System.out.println("Width = " + r1.width);
        System.out.println("Height = " + r1.height);
        System.out.println("Area = " + r1.area());
        System.out.println("Perimeter = " + r1.perimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Width = " + r2.width);
        System.out.println("Height = " + r2.height);
        System.out.println("Area = " + r2.area());
        System.out.println("Perimeter = " + r2.perimeter());

        if (r1.area() > r2.area()) {
            System.out.println("\nRectangle 1 has larger area\n");
        } else {
            System.out.println("\nRectangle 2 has larger area\n");
        }
    }
}