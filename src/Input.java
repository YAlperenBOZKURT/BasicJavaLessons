import java.util.Locale;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        // Set the Scanner's Locale to use a dot (.) as the decimal separator
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Please enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered an integer: " + number);

        // Consume the newline character left by nextInt()
        scanner.nextLine();

        System.out.print("Please enter a decimal number: ");
        double decimalNumber = scanner.nextDouble();
        System.out.println("You entered a decimal number: " + decimalNumber);

        // Consume the newline character left by nextDouble()
        scanner.nextLine();

        System.out.print("Please enter some text: ");
        String text = scanner.nextLine();
        System.out.println("You entered text: " + text);

        scanner.close();
    }
}
