import java.util.Arrays;

public class MaxMinSumDifference {
    public static void main(String[] args) {
        int[] array = {14, 16, 87, 36, 25, 89, 34};
        int m = 1;
        int n = 3;

        Arrays.sort(array);


        int mthMax = array[array.length - m];

  
        int nthMin = array[n - 1];

        
        int sum = mthMax + nthMin;
        int difference = mthMax - nthMin;

        // Display the results
        System.out.println("1st Maximum Number = " + mthMax);
        System.out.println(n + "th Minimum Number = " + nthMin);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
    }
}
