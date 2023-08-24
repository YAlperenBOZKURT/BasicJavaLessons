public class ExceptionExample {
    public static void main(String[] args) {


        // Normally, it won't give an error during compilation but will result in an error at runtime.
        // We place try-catch around potential error-prone code.

        try {

            int[] array = { 1, 2, 3, 4, 5 };

            System.out.println("Element at index 10 of the array: " + array[-11]);

        } catch (ArrayIndexOutOfBoundsException a) {
            // TODO: handle exception
            System.out.println(a.getMessage());
            System.out.println("Please enter a valid index!");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred....");
        } catch (NumberFormatException e) {
            System.out.println("Number format exception occurred...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally { // Finally block always runs, regardless of whether there was an error or not.

            System.out.println("Finally block executed.");
        }

        // It caught the error, and the program continued to execute. Normally, it would halt upon encountering an error.
        // We write multiple catch blocks to handle different types of errors.
        // If it cannot catch the error and an error occurs, the application crashes and doesn't continue.
        // Exception is the most general type of error. If caught, it should be at the end.
        // From specific to general error handling.

        System.out.println("Last code line");

        // Throw => To throw.
        // Throws
        // Unchecked
        // Checked

        try {
            checkNumber(10);   // Here, we're catching the exception thrown within the method.
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("The thrown exception is caught here");
        }

    }

    public static void checkNumber(int number) throws Exception {
//		if (number > 5) {
//			throw new NumberFormatException(); // unchecked exception
//
//		}

        if (number > 5) {
            throw new Exception(); // unchecked exception

        }
    }

}
