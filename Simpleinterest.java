import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        double principal = s.nextDouble();
        
        System.out.print("Enter the time (in years): ");
        double time = s.nextDouble();
        
        System.out.print("Are you a senior citizen (yes/no)? ");
        String seniorCitizenInput = s.next();
        
        double rateOfInterest;
        
        if (seniorCitizenInput.equalsIgnoreCase("yes")) {
            rateOfInterest = 0.12; 
        } else {
            rateOfInterest = 0.10; 
        }
        
        double simpleInterest = calculateSimpleInterest(principal, time, rateOfInterest);
        
        System.out.println("Simple Interest: " + simpleInterest);
        
        s.close();
    }

    public static double calculateSimpleInterest(double principal, double time, double rateOfInterest) {
        return (principal * rateOfInterest * time);
    }
}
