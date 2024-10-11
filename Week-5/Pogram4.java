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

    static void sortBySemesterAndCGPA(Student[] students, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].sem > students[j].sem || 
                    (students[i].sem == students[j].sem && students[i].cgpa < students[j].cgpa)) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    static void sortByName(Student[] students, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].fullName.compareTo(students[j].fullName) > 0) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
}

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Year of Joining: ");
            int year = sc.nextInt();
            System.out.print("Count of Student in that year: ");
            int count = sc.nextInt();
            sc.nextLine(); // Consume the newline
            System.out.print("Full Name: ");
            String fullName = sc.nextLine();
            System.out.print("Date of Joining (dd mm yyyy): ");
            int day = sc.nextInt();
            int month = sc.nextInt() - 1; // GregorianCalendar months are 0-based
            int yearJoining = sc.nextInt();
            GregorianCalendar dateOfJoining = new GregorianCalendar(yearJoining, month, day);
            System.out.print("Semester: ");
            short semester = sc.nextShort();
            System.out.print("GPA: ");
            float gpa = sc.nextFloat();
            System.out.print("CGPA: ");
            float cgpa = sc.nextFloat();
            sc.nextLine(); // Consume the newline

            students[i] = new Student(year, count, fullName, dateOfJoining, semester, gpa, cgpa);
            System.out.println();
        }

        System.out.println("Displaying Student Records:");
        for (Student student : students) {
            student.display();
            System.out.println();
        }

        System.out.println("Sorting by Semester and CGPA:");
        Student.sortBySemesterAndCGPA(students, 5);
        for (Student student : students) {
            student.display();
            System.out.println();
        }

        System.out.println("Sorting by Name:");
        Student.sortByName(students, 5);
        for (Student student : students) {
            student.display();
            System.out.println();
        }

        sc.close();
    }
}
