package Dpack;

import Bpack.B;
import Cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
		
		System.out.print("\nBhoomika Maheshwari");
		System.out.println("\nEnrollment Number: 240390107020\n");	

        B b = new B(1, 2, 3);
        C c = new C();

        b.display();
        c.display();
    }
}