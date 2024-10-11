import java.util.Scanner;

class Student {
    String sname, initial = "";
    String wname = "";

    Student(String sname) {
        this.sname = sname;
    }

    void extractInitials() {
        if (sname.length() > 0) {
            initial += Character.toUpperCase(sname.charAt(0));
            for (int i = 1; i < sname.length(); i++) {
                if (sname.charAt(i - 1) == ' ') {
                    initial += Character.toUpperCase(sname.charAt(i));
                }
            }
        }
    }

    void removeWhiteSpace() {
        wname = sname.replaceAll("\\s+", "");
    }

    boolean containsSubstring(String sub) {
        return sname.contains(sub);
    }

    static void sort(Student[] s, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].sname.compareTo(s[j].sname) > 0) {
                    Student temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
    }

    void display() {
        System.out.println("Student Name: " + sname);
        System.out.println("Initials: " + initial);
        System.out.println("Name without whitespace: " + wname);
    }
}

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] s1 = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of student " + (i + 1) + ": ");
            String Sname = sc.nextLine();
            s1[i] = new Student(Sname);
            s1[i].extractInitials();
            s1[i].removeWhiteSpace();
        }
        System.out.println("Enter the substring to search for: ");
        String sub = sc.nextLine();
        System.out.println("Students with name containing the substring \"" + sub + "\": ");
        for (Student student : s1) {
            if (student.containsSubstring(sub)) {
                student.display();
            }
        }
        Student.sort(s1, n);
        System.out.println("\nStudents sorted: ");
        for (Student student : s1) {
            student.display();
            System.out.println();
        }
        sc.close();
    }
}
