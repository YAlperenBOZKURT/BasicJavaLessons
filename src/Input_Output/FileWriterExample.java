package Input_Output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {

        FileWriter writer = null;
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
                writer = new FileWriter(file,true);
                writer.write("Yusuf Alperen Bozkurt,");
                writer.write(" Software Engineer");
                System.out.println("Done!");
            } catch (IOException e) {
                System.out.println("Error => " + e.getMessage());
            }
            finally {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Error => " + e.getMessage());
                }
            }

        }
    }
}