package Generic;

public class GenerichMethod<T> {
    public static void main(String[] args) {

        String[] strArray = {"alperen", "bozkurt"};

        Integer[] intArray = {2, 3, 45, 5};

        Double[] floatArray = {2.3,35.5,5.0};

        printItem(strArray);
        System.out.println("--------------------------------------------------------");
        printItem(intArray);
        System.out.println("--------------------------------------------------------");
        printItem(floatArray);
    }


    // Generic method
    // Generic methods are methods that can work with different data types and provide type safety among these data types.
    public static <T> void printItem(T[] array) {

        for (T value : array) {
            System.out.println(value);
        }

    }
}
