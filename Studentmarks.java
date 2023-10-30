import java.util.Scanner;

class Studentmark {
    String name;

    Studentmark(String name) {
        this.name = name;
    }
}

class Marks extends Studentmark {
    int pythonMarks;
    int cProgrammingMarks;
    int mathematicsMarks;
    int physicsMarks;

    Marks(String name) {
        super(name);
    }

    void enterMarks() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the marks in Python: ");
        pythonMarks = s.nextInt();
        System.out.print("Enter the marks in C Programming: ");
        cProgrammingMarks = s.nextInt();
        System.out.print("Enter the marks in Mathematics: ");
        mathematicsMarks = s.nextInt();
        System.out.print("Enter the marks in Physics: ");
        physicsMarks = s.nextInt();
    }

    int calculateTotal() {
        return pythonMarks + cProgrammingMarks + mathematicsMarks + physicsMarks;
    }
}

class Result extends Marks {
    Result(String name) {
        super(name);
    }

    void calculateAndDisplayResult() {
        int totalMarks = calculateTotal();
        double aggregate = totalMarks / 4.0;

        System.out.println("Total = " + totalMarks);
        System.out.println("Aggregate = " + aggregate);

        if (aggregate > 75) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 60 && aggregate < 75) {
            System.out.println("First Division");
        } else if (aggregate >= 50 && aggregate < 60) {
            System.out.println("Second Division");
        } else if (aggregate >= 40 && aggregate < 50) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }
    }
}
class Studentmarks {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = s.nextLine();

        Result studentResult = new Result(name);
        studentResult.enterMarks();
        studentResult.calculateAndDisplayResult();
    }
}
