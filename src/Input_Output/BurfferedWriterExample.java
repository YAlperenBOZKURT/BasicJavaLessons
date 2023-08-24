package Input_Output;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BurfferedWriterExample {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\yalpe\\Desktop\\test.txt");
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(new File(String.valueOf(file)),true))) {
        writer.write("\n johnny, Film star");
        } catch (IOException e) {
            System.out.println("Error : " +  e.getMessage());
        }


    }

}
