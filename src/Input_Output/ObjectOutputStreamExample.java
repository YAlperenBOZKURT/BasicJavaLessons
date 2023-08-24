package Input_Output;

import java.io.*;
import java.io.FileOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) {

        StudentModel[] studentList = new StudentModel[] {
                new StudentModel(2,"Alperen","bozkurt"),
                new StudentModel(5,"Yusuf","bozkurt"),
                new StudentModel(52,"bozkurt","bozkurt"),
        };


        File file = new File("C:\\Users\\yalpe\\Desktop\\test2.bin");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(studentList);
            System.out.println("done!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
