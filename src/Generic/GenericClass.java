package Generic;

public class GenericClass <T>{
    private  T content;


    public GenericClass(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
