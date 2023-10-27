import java.util.Scanner;
import java.math.BigInteger;

public class LCMGCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of values: ");
        int n = s.nextInt();

        if (n <= 1) {
            System.out.println("Please enter at least two values.");
            return;
        }

        BigInteger[] values = new BigInteger[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            values[i] = s.nextBigInteger();
        }

        BigInteger lcm = calculateLCM(values);
        BigInteger gcd = calculateGCD(values);

        System.out.println("LCM: " + lcm);
        System.out.println("GCD: " + gcd);

        s.close();
    }

    public static BigInteger calculateLCM(BigInteger[] values) {
        BigInteger lcm = values[0];
        for (int i = 1; i < values.length; i++) {
            lcm = lcm.multiply(values[i]).divide(lcm.gcd(values[i]));
        }
        return lcm;
    }

    public static BigInteger calculateGCD(BigInteger[] values) {
        BigInteger gcd = values[0];
        for (int i = 1; i < values.length; i++) {
            gcd = gcd.gcd(values[i]);
        }
        return gcd;
    }
}
