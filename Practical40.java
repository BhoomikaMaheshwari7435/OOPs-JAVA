class Table {

    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
        }
        System.out.println();
    }
}

class T1 extends Thread {

    Table t;

    T1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class T2 extends Thread {

    Table t;

    T2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(7);
    }
}
public class Practical40 {
    public static void main(String[] args) {
	
		System.out.print("\nBhoomika Maheshwari");
		System.out.println("\nEnrollment Number: 240390107020\n");

        Table t = new Table();
        T1 t1 = new T1(t);
        T2 t2 = new T2(t);
        t1.start();
        t2.start();
    }
}
