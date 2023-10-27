import java.util.*;

public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the value of M: ");
        int m = s.nextInt();

        System.out.print("Enter the value of N: ");
        int n = s.nextInt();

        printMultiplicationtable(m, n);

        s.close();
    }

    public static void printMultiplicationtable(int m, int n) {
        for (int i = 1; i <= n; i++) {
            int result = m * i;
            System.out.println(i + "x" + m + "=" + result);
        }
    }
}
