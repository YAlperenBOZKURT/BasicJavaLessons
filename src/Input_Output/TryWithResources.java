package Input_Output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {


    public static void main(String[] args) {


        File file = new File("C:\\Users\\yalpe\\Desktop\\test.txt");


        try(FileWriter writer = new FileWriter(new File(String.valueOf(file)),true)) {

            writer.write("\n Katrina, Manager");

        } catch (IOException e) {
            System.out.println("Error => " + e.getMessage());
        }
    }
}

