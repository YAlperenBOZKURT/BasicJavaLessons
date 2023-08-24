package Input_Output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\yalpe\\Desktop\\test.txt");

        if(!file.exists()) {
            System.out.println("file not found");
        }
        else {
           FileInputStream fileStream = null;
           int value = 0;
            try {
                fileStream = new FileInputStream(file);
                while ((value = fileStream.read()) != -1){
                    char singleChar = (char) value;
                    System.out.println("char : " + singleChar);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error : " +  e.getMessage());
            } catch (IOException e) {
                System.out.println("Error : " +  e.getMessage());
            }
        }
    }
}
