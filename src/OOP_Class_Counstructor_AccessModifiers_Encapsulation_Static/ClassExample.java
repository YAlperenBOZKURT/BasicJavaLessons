package OOP_Class_Counstructor_AccessModifiers_Encapsulation_Static;


public class ClassExample { // Class

    // Access Modifiers
    // public: Accessible from everywhere.
    // private: Accessible only within the same class.
    // protected: Accessible within the same class + subclasses that inherit from it.

    public int id;

    public String firstName;

    public String lastName;


    private int age;

    // Constructor

    // Empty Constructor
    public ClassExample() {
    }

    public ClassExample(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void methodExample() {
        System.out.println("Hey there!");
    }

    public static void stacticMethodExample() {
        System.out.println("This is static method!");
    }

    // Encapsulation
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
