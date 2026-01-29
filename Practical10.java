import java.util.Scanner;
class Employee {
	
    private String employeeName;
    private double employeeSalary;
    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name : ");
        employeeName = sc.nextLine();

        System.out.print("Enter Employee Salary(Monthly) : ");
        employeeSalary = sc.nextDouble();
    }
    public void displayEmployeeData() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name   : " + employeeName);
        System.out.println("Salary : " + employeeSalary);
    }
    public static void main(String[] args) {

		System.out.println("\nBhoomika Maheshwari");
		System.out.println("Enrollment No. : 240390107020\n");
        Employee emp = new Employee(); 

        emp.readEmployeeData();        
        emp.displayEmployeeData();     
    }
}

