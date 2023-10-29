import java.util.Scanner;

public class Charactercount {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;

        System.out.println("Enter characters (type * to exit):");

        while (true) {
            char in = s.next().charAt(0);

            if (in == '*') {
                break;
            }

            if (Character.isUpperCase(in)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(in)) {
                lowercaseCount++;
            } else if (Character.isDigit(in)) {
                digitCount++;
            }
        }

        System.out.println("Uppercase letters entered: " + uppercaseCount);
        System.out.println("Lowercase letters entered: " + lowercaseCount);
        System.out.println("Numbers entered: " + digitCount);
    }
}