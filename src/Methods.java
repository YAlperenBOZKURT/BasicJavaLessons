public class Methods {
    public static void main(String[] args) {

        // There are 2 types of methods:
        //  1) Methods without a return value
        //  2) Methods that return a value

        voidMethod();

        fullNameOutput("Alperen", "Bozkurt");

        System.out.println(squareOfNumber(5));

        System.out.println(fullName("alperen", "bozkurt"));

    }

    // This is a parameterless and void-returning method.
    public static void voidMethod() {
        System.out.println("This is a parameterless and void-returning method.");
    }

    // A method that takes parameters and does not return data.
    public static void fullNameOutput(String firstName, String lastName) {
        System.out.println("My name is  : " + firstName + " " + lastName);
    }

    // A method that takes an integer parameter and returns an integer.
    public static int squareOfNumber(int number) {

        return number * number;
    }

    // A method that accepts a string parameter and returns a string.
    public static String fullName(String firstName, String lastName) {

        return firstName + " " + lastName;
    }


}
