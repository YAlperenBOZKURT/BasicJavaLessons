package Generic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        GenericClass<Integer> intBox = new GenericClass<>(42); //
        int intValue = intBox.getContent();
        System.out.println("int value : " + intValue);
        System.out.println("--------------------------------------------------");

        GenericClass<String> strBox = new GenericClass<>("Hello"); //
        String strValue = strBox.getContent();
        System.out.println("string value : " +  strValue);


        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------");

        GenericInterface<String, Integer> pair1 = new GenericInterfaceService<>("age", 30);
        System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());

        GenericInterface<String, String> pair2 = new GenericInterfaceService<>("name", "John");
        System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());


    }
}
