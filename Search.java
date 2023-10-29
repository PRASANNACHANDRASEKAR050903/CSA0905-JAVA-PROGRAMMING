import java.util.Scanner;

public class Search {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.print("Enter the string: ");
        String in = s.nextLine();

        System.out.print("Enter the character to be searched: ");
        char search = s.next().charAt(0);
        int index = -1;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == search) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println(search + " is found in the string at index: " + index);
        } else {
            System.out.println(search + " is not found in the string.");
        }
    }
}