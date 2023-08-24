package OOPV2_Inheritance;

public class Main {
    public static void main(String[] args) {


    // ClassA sub class, ClassB Super class
    // ClassB sub class, ClassC Super class

        ClassA test = new ClassA();


        System.out.println("--------------------------------------------------------------");

        ClassA testv2 = new ClassA(1,2,3,5);
        System.out.println("Value A - 1 : " + testv2.getValueA1());
        System.out.println("Value B - 1 : " + testv2.getValueB1());
    }
}
