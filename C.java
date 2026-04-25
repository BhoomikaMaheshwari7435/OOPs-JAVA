package Cpack;

import Apack.A;

public class C {

    public void display() {
        A obj = new A(10, 20, 30);

        System.out.println("C Class:");
        System.out.println("Public: " + obj.pubVar);
        // System.out.println("Protected: " + obj.protVar); // Not Accessible
        // System.out.println("Private: " + obj.privVar); //Not Accessible
    }
}