class T1 extends Thread {
    int sum = 0;
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }}
    int getSum() {
        return sum;
    }}

class T2 extends Thread {

    int sum = 0;

    public void run() {
        for (int i = 1001; i <= 2000; i++) {
            sum += i;
        }
    }

    int getSum() {
        return sum;
    }
}

public class Practical41 {
    public static void main(String[] args) {
	
		System.out.print("\nBhoomika Maheshwari");
		System.out.println("\nEnrollment Number: 240390107020\n");

        T1 t1 = new T1();
        T2 t2 = new T2();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }

        int total = t1.getSum() + t2.getSum();

        System.out.println("Final Sum = " + total);
    }
}