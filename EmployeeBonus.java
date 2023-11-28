import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the grade of the employee: ");
        char grade = scanner.next().charAt(0);

        System.out.print("Enter the employee salary: ");
        double salary = scanner.nextDouble();


        double bonus = 0.0;

        if (grade == 'A') {
            bonus = 0.05 * salary;
        } else if (grade == 'B') {
            bonus = 0.10 * salary;
        }

      
        if (salary < 10000) {
            bonus += 0.02 * salary;
        }

      
        double totalSalary = salary + bonus;

        // Display the results
        System.out.println("Salary=" + salary);
        System.out.println("Bonus=" + bonus);
        System.out.println("Total to be paid: " + totalSalary);
    }
}
