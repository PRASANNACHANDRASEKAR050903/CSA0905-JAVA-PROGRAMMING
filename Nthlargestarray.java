import java.util.Scanner;
import java.util.*;

public class Nthlargestarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of n (position of the nth largest number): ");
        int a = scanner.nextInt();

        int nthLargest = findNthLargest(numbers, a);

        System.out.println("The " + a + "th largest number is: " + nthLargest);

      
        scanner.close();
    }

    public static int findNthLargest(int[] numbers, int a) {
        if (a <= 0 || a > numbers.length) {
            throw new IllegalArgumentException("Invalid value ");
        }

        // Sort the array in descending order
        Arrays.sort(numbers);
        int index = numbers.length - a;
        return numbers[index];
    }
}
