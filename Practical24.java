/* Create a base class named Employee that contains a method displayDetails() which prints general employee 
details such as name and department. Now create a subclass Manager that inherits from Employee and overrides 
the displayDetails() method to include additional information such as the manager’s team size or project name. 
In the main method, create objects of both Employee and Manager classes and call the displayDetails() method 
using each object to show how Java determines which version of the method to execute at runtime. */

import java.util.Scanner;
class Employee {
    String name, department;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}
class Manager extends Employee {

    int teamSize;
    String project;

    void getManagerData() {
        Scanner sc = new Scanner(System.in);

        getData();

        System.out.print("Enter Team Size: ");
        teamSize = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Project Name: ");
        project = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("\nManager Details:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + project);
    }
}

public class Practical24 {
    public static void main(String[] args) {
		
		System.out.print("\nBhoomika Maheshwari");
		System.out.println("\nEnrollment Number: 240390107020\n");
        Employee e = new Employee();
        e.getData();
        e.displayDetails();

        Manager m = new Manager();
        m.getManagerData();
        m.displayDetails();
    }
}