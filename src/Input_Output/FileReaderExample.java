package Input_Output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {

    public static void main(String[] args) {

        FileReader reader = null;
        File file = new File("C:\\Users\\yalpe\\Desktop\\test.txt");

        if(!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("Created File");
            } catch (IOException e) {
                System.out.println("Error => " + e.getMessage());
            }
        }
        else {
            try {
                Scanner userInput = new Scanner(new FileReader(file));
                while (userInput.hasNextLine()) {
                    String employee = userInput.nextLine();
                    String[] employeeArray = employee.split(",");

                    System.out.println(employeeArray[0]);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error => " + e.getMessage());
            }

            ;
        }

    }

}
