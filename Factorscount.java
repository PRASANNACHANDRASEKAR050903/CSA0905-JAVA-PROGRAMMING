import java.util.Scanner;

public class Factorscount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number: ");
        int givenNumber = scanner.nextInt();

        // Calculate and Output
        int factorsCount = countFactors(givenNumber);
        System.out.println("Number of factors = " + factorsCount);
    }


    private static int countFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}
