package Bpack;

import Apack.A;

public class B extends A {

    public B(int a, int b, int c) {
        super(a, b, c);
    }

    public void display() {
        System.out.println("B Class:");
        System.out.println("Public: " + pubVar);
        System.out.println("Protected: " + protVar);
        // System.out.println("Private: " + privVar); // not accessible
    }
}