package Input_Output;

import java.io.Serializable;

public class StudentModel implements Serializable {

    public int id;
    public String name;
    public String lastname;

    public StudentModel(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }
}
