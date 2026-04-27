class Practical35 {

    static double average(String[] values) throws NullPointerException, NumberFormatException {

        double sum = 0;

        for (int i = 0; i < values.length; i++) {

            if (values[i] == null) {
                throw new NullPointerException("Null value found");
            }

            double num = Double.parseDouble(values[i]);
            sum += num;
        }

        return sum / values.length;
    }

    public static void main(String[] args) {
		
		System.out.print("\nBhoomika Maheshwari");
		System.out.println("\nEnrollment Number: 240390107020\n");

        String[] arr1 = {"10", "20", "30"};
        String[] arr2 = {"10", null, "30"};
        String[] arr3 = {"10", "abc", "30"};

        try {
            System.out.println("Average = " + average(arr1));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Done with arr1\n");
        }

        try {
            System.out.println("Average = " + average(arr2));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Done with arr2\n");
        }

        try {
            System.out.println("Average = " + average(arr3));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Done with arr3");
        }
    }
}