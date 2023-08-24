package Input_Output;

import java.io.*;

public class ObjectInputStreamExample {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\yalpe\\Desktop\\test2.bin");

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(String.valueOf(file))))) {
            try {
                StudentModel[] studentList = (StudentModel[])in.readObject();
                for (StudentModel student : studentList){
                    System.out.println("ID : " + student.id);
                    System.out.println("Name : " + student.name);
                    System.out.println("Lastname : " + student.lastname);
                    System.out.println("--------------------------------------------------------");

                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
