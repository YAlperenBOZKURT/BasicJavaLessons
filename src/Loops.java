public class Loops {
    public static void main(String[] args){

        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        int count = 1;

        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 5);

    }

}
