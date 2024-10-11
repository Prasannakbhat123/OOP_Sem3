import java.util.*;

class Student {
    private String name;
    private int roll;
    private int[] theoryMarks;

    public Student(String n, int r, int[] marks) {
        name = n;
        roll = r;
        theoryMarks = marks;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.print("Marks: ");
        for (int mark : theoryMarks) {
            System.out.print(mark + " ");
        }
        System.out.println(); 
    }

    public float compute() {
        if (theoryMarks.length == 0) {
            return 0.0f; 
        }
        int sum = 0;
        for (int mark : theoryMarks) {
            sum += mark;
        }
        return (float) sum / theoryMarks.length;
    }
}

class ScienceStudent extends Student {
    private int[] practicalMarks;

    ScienceStudent(String n, int r, int[] marks, int[] pMarks) {
        super(n, r, marks);
        practicalMarks = pMarks;
    }

    @Override
    public float compute() {
        if (practicalMarks.length == 0) {
            return super.compute(); 
        }
        float theoryAverage = super.compute();
        float practicalAverage = (float) Arrays.stream(practicalMarks).average().orElse(0.0);
        return (theoryAverage + practicalAverage) / 2.0f;
    }

    public void displayPracticalMarks() {
        System.out.print("Practical Marks: ");
        for (int mark : practicalMarks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}

class ArtsStudent extends Student {
    private String electiveSubject;

    ArtsStudent(String n, int r, int[] marks, String e) {
        super(n, r, marks);
        electiveSubject = e;
    }

    public void displayElectiveSubject() {
        System.out.println("Elective Subject: " + electiveSubject);
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter number of theory subjects: ");
        int numT = sc.nextInt();

        int[] theoryMarks = new int[numT];
        System.out.println("Enter marks for each theory subject:");
        for (int i = 0; i < numT; i++) {
            theoryMarks[i] = sc.nextInt();
        }

        sc.nextLine();

        System.out.print("Enter number of practical subjects: ");
        int numP = sc.nextInt();

        int[] practicalMarks = new int[numP];
        System.out.println("Enter marks for each practical subject:");
        for (int i = 0; i < numP; i++) {
            practicalMarks[i] = sc.nextInt();
        }

        sc.nextLine();

        Student student = new Student(name, roll, theoryMarks);
        
        System.out.println("\nStudent Details:");
        student.display();
        
        System.out.println("Average Marks: " + student.compute());

        ScienceStudent scStd = new ScienceStudent(name, roll, theoryMarks, practicalMarks);
        scStd.displayPracticalMarks();
        System.out.println("Average of Theory and Practical Marks: " + scStd.compute());

        System.out.print("Enter Elective Subject: ");
        String elective = sc.nextLine();
        ArtsStudent artStd = new ArtsStudent(name, roll, theoryMarks, elective);
        artStd.displayElectiveSubject();

        sc.close();
    }
}
