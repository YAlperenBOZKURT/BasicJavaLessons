package Input_Output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutputStream {

    public static void main(String[] args) {

        // java Input - Output

        File file = new File("C:\\Users\\yalpe\\Desktop\\test.txt");

        if(!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("Creating File");
            } catch (IOException e) {
                System.out.println("Error : " + e.getMessage());
            }
        }
        else {
            java.io.FileOutputStream out = null;
            try {
                // If you want each written value to be appended to the next one, you need to provide the true parameter.
                out = new java.io.FileOutputStream(file,true);
                out.write(483);
            } catch (FileNotFoundException e) {
                System.out.println("Error : " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Error : " + e.getMessage());
            }
            finally {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println("Error => " + e.getMessage());
                }
            }
        }


    }
}
