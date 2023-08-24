package Input_Output;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedReaderExample {


    public static void main(String[] args) {

        File file = new File("C:\\Users\\yalpe\\Desktop\\test.txt");

        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(new File(String.valueOf(file)))))) {
                while (scanner.hasNextLine()){
                    System.out.println(scanner.nextLine());
                }
        } catch (FileNotFoundException e) {
            System.out.println("Error : " +  e.getMessage());
        }

    }
}
