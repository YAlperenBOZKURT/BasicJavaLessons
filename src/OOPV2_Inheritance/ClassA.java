package OOPV2_Inheritance;


public class ClassA extends ClassB {

    private  int valueA1;

    private int valueA2 ;

    public ClassA(int valueA1, int valueA2, int valueB1, int valueB2) {
        super(valueB1, valueB2); // We passed it to the constructor of the upper class.
        this.valueA1 = valueA1;
        this.valueA2 = valueA2;

    }

    public ClassA() {
        System.out.println("Class A Const");
    }

    public void ClassAMethod() {
        System.out.println("This is Class A method!");
    }

    public int getValueA1() {
        return valueA1;
    }

    public void setValueA1(int valueA1) {
        this.valueA1 = valueA1;
    }

    public int getValueA2() {
        return valueA2;
    }

    public void setValueA2(int valueA2) {
        this.valueA2 = valueA2;
    }
}
