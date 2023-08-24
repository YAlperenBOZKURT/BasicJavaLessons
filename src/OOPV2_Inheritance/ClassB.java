package OOPV2_Inheritance;

public class ClassB extends ClassC {

    private  int valueB1;

    private int valueB2 ;

    public ClassB() {
        System.out.println("ClassB Const");
    }

    public ClassB(int valueB1, int valueB2) {
        this.valueB1 = valueB1;
        this.valueB2 = valueB2;
    }


    public int getValueB1() {
        return valueB1;
    }

    public void setValueB1(int valueB1) {
        this.valueB1 = valueB1;
    }

    public int getValueB2() {
        return valueB2;
    }

    public void setValueB2(int valueB2) {
        this.valueB2 = valueB2;
    }
}
