 class Numberpattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print numbers in ascending order
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

        // Lower part of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print numbers in ascending order
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
