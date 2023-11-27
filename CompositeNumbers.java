import java.util.Scanner;

public class CompositeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for A: ");
        int A = scanner.nextInt();
        System.out.print("Enter the value for B: ");
        int B = scanner.nextInt();


        System.out.println("Composite numbers between " + A + " and " + B + " are:");
        printCompositeNumbers(A, B);
    }

    private static boolean isComposite(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }


    private static void printCompositeNumbers(int A, int B) {
        for (int i = A; i <= B; i++) {
            if (isComposite(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Move to the next line after printing the numbers
    }
}
