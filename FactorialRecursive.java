import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

   
        long factorial = calculateFactorial(n);
        System.out.println("The factorial of " + n + " is: " + factorial);
    }

 
    private static long calculateFactorial(int num) {
        
        if (num == 0) {
            return 1;
        } else {
           
            return num * calculateFactorial(num - 1);
        }
    }
}
