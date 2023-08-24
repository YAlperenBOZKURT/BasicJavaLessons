public class IfElse_SwitchCase {
    public static void main(String[] args) {


        //If else
        int number = 10;

        if (number >= 10) {
            // Code to execute if condition1 is true
        } else if (number <= 10) {
            // Code to execute if condition2 is true and condition1 is false
        } else {
            // Code to execute if both condition1 and condition2 are false
        }


        // Switch case
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
        }

    }


}


