package OOP_Class_Counstructor_AccessModifiers_Encapsulation_Static;

public class Main {

    public static void main(String[] args) {

        ClassExample student = new ClassExample(); // -> Instance

        // Assign value to instance
        student.id = 1;
        student.firstName = "Alperen";
        student.lastName = "Bozkurt";

        System.out.println("Student  Details :");
        System.out.println("ID : " + student.id);
        System.out.println("İsim : " + student.firstName);
        System.out.println("Soyisim : " + student.lastName);

        student.methodExample();

        // Encapsulation

        // We cannot access private values directly, but we can use Encapsulation to retrieve them using getters and assign values using setters.

        student.setAge(25);
        System.out.println(student.getAge());


        // There is no need to create an instance for static methods.
        ClassExample.stacticMethodExample();

    }


}
