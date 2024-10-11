import java.util.*;

class Student {
    int regNumber;
    String fullName;
    GregorianCalendar dateOfJoining;
    short sem;
    float gpa, cgpa;

    Student(int year, int count, String fname, GregorianCalendar date, short s, float gp, float cgp) {
        regNumber = generateRegNumber(year, count);
        fullName = fname;
        dateOfJoining = date;
        sem = s;
        gpa = gp;
        cgpa = cgp;
    }

    int generateRegNumber(int year, int count) {
        return (year % 100) * 100 + count;
    }

    void display() {
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Joining: " + dateOfJoining.getTime());
        System.out.println("Semester: " + sem);
        System.out.println("GPA: " + gpa);
        System.out.println("CGPA: " + cgpa);
    }
}

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ": ");
            
            System.out.println("Full Name:");
            String fullName = sc.nextLine();
            
            System.out.println("Year of Joining:");
            int year = sc.nextInt();
            
            System.out.println("Date of Joining (day month year):");
            int day = sc.nextInt();
            int month = sc.nextInt() - 1; // Adjust for zero-based month
            int yearJoining = sc.nextInt();
            GregorianCalendar dateOfJoining = new GregorianCalendar(yearJoining, month, day);
            
            System.out.println("Semester:");
            short semester = sc.nextShort();
            
            System.out.println("GPA:");
            float gpa = sc.nextFloat();
            
            System.out.println("CGPA:");
            float cgpa = sc.nextFloat();
            
            // Increment the count for each student
            int count = i + 1; // Count is used for generating registration number

            students[i] = new Student(year, count, fullName, dateOfJoining, semester, gpa, cgpa);
            System.out.println();
        }

        // Display all student details
        for (Student student : students) {
            student.display();
            System.out.println();
        }

        sc.close();
    }
}
