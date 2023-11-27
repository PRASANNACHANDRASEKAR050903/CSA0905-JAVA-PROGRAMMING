import java.util.Arrays;

public class Missingnumber {

    public static void main(String[] args) {
        
        int[] nums = {3, 0, 1};

     
        int missingNumber = findMissingNumber(nums);
        System.out.println("Missing number: " + missingNumber);
    }


    private static int findMissingNumber(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }


        return n;
    }
}
