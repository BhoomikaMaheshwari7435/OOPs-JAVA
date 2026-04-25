package exam;

import student.Student;

public class Result extends Student {

    int marks1, marks2, marks3;

    public Result(int r, String n, int m1, int m2, int m3) {
        super(r, n);
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    public void displayResult() {
        int total = marks1 + marks2 + marks3;
        double avg = total / 3.0;

        displayStudent();
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}