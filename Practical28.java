interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {

    public boolean isPassed(int mark) {
        return mark >= 35;
    }

    public String getDivision(double average) {
        if (average >= 60)
            return "First Division";
        else
            return "Other Division";
    }
}

public class Practical28 {
    public static void main(String[] args) {
		
		System.out.print("\nBhoomika Maheshwari");
		System.out.println("\nEnrollment Number: 240390107020\n");
        Result r = new Result();

        int mark = 50;
        double avg = 65.0;

        if (r.isPassed(mark))
            System.out.println("Passed");
        else
            System.out.println("Failed");

        System.out.println("Division: " + r.getDivision(avg));
    }
}