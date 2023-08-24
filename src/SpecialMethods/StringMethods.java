package SpecialMethods;

public class StringMethods {
        /* String:

    length(): Return the length of the string (number of characters).
    charAt(index): Get the character at a specific index.
    substring(beginIndex, endIndex): Get a substring within a specified range.
    concat(str): Concatenate a string with another string.  */


    public static void main(String[] args) {
        String text = "Hello, World!";
        int length = text.length();
        char charAtIndex = text.charAt(7);
        String subString = text.substring(0, 5);
        String combined = text.concat(" Welcome");
        System.out.println("Length of text: " + length);
        System.out.println("Character at index 7: " + charAtIndex);
        System.out.println("Substring: " + subString);
        System.out.println("Combined string: " + combined);
    }
}
