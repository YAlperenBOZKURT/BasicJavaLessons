public class Arrays {

    public static void main(String[] args) {


        // There are 3 different methods to define:

        int[] numbers = new int[5];

        // assign value
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;


        int[] numbersv2 = {10, 20, 30, 40, 50};

        int[] numbersv3 = new int[] {10, 20, 30, 40, 50};

        Object[] diffTypes = new Object[5];
        diffTypes[0] = 42;        // int tipi
        diffTypes[1] = 3.14;      // double tipi
        diffTypes[2] = "Merhaba"; // String tipi

        for (Object deger : diffTypes) { // foreach yapısı
            System.out.println(deger);
        }

        Object[] diffTypesv2 = {"alperen", 2, 15.4};

        for (Object deger : diffTypesv2) { // foreach yapısı
            System.out.println(deger);
        }

    }
}
