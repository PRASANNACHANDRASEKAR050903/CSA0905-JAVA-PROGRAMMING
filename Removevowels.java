import java.util.Scanner;
class Removevowels {
    public static void main(String[] args) {
   
        Scanner s = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String in = s.nextLine();

        String str = removeVowels(in);

        
        System.out.println("The string without vowels is: " + str);

    }

    public static String removeVowels(String input) {
        String vowels = "aeiouAEIOU";

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);
            if (vowels.indexOf(c) == -1) {
                result.append(c);
            }
        }

        return result.toString();
    }
}