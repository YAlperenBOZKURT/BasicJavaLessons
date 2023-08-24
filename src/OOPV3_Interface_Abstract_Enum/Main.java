package OOPV3_Interface_Abstract_Enum;

public class Main {



    public static void main(String[] args) {

        // "It's giving an error, abstract class is not instantiated."
        // AbstractClass test = new AbstractClass();


        ClassA test = new ClassA();

        test.age = 5;
        test.name = "Alperen";
        test.sex = EnumExampleSex.MALE;
        System.out.println("Age : " + test.age + " " + " Name : " + test.age );
        System.out.println("Sex : " + test.sex );
        test.count();

    }




}
