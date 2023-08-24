public class ConvertType {
    public static void main(String[] args) {
        // Numeric Data Type Conversions

        // Widening Conversion (Automatic)
        int intValue = 5;
        double doubleValue = intValue; // Automatic conversion
        System.out.println("Widening Conversion: int to double");
        System.out.println("intValue: " + intValue);
        System.out.println("doubleValue: " + doubleValue);

        // Narrowing Conversion (Explicit Casting)
        doubleValue = 3.14;
        int intValueAgain = (int) doubleValue; // Explicit casting
        System.out.println("Narrowing Conversion: double to int");
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("intValueAgain: " + intValueAgain);

        // String to Numeric and Numeric to String Conversions

        // String to Numeric
        String strNumber = "123";
        int parsedIntValue = Integer.parseInt(strNumber);      // String to int
        double parsedDoubleValue = Double.parseDouble(strNumber); // String to double
        System.out.println("String to Numeric Conversions:");
        System.out.println("parsedIntValue: " + parsedIntValue);
        System.out.println("parsedDoubleValue: " + parsedDoubleValue);

        // Numeric to String
        int number = 42;
        String strNumberAgain = String.valueOf(number); // int to String
        String concatenated = "The number is: " + number; // Concatenation
        System.out.println("Numeric to String Conversions:");
        System.out.println("strNumberAgain: " + strNumberAgain);
        System.out.println("concatenated: " + concatenated);
    }
}
