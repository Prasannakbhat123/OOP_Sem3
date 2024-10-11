import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class Person {
    private String name;
    private Date birthDate;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Name: " + name + ", Birth Date: " + sdf.format(birthDate);
    }
}

class CollegeGraduate extends Person {
    private double gpa;
    private int graduationYear;

    public CollegeGraduate(String name, Date birthDate, double gpa, int graduationYear) {
        super(name, birthDate);
        this.gpa = gpa;
        this.graduationYear = graduationYear;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return super.toString() + ", GPA: " + gpa + ", Graduation Year: " + graduationYear;
    }
}

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter person's name: ");
        String name = sc.nextLine();

        System.out.print("Enter person's birth date (dd/MM/yyyy): ");
        String birthDateStr = sc.nextLine();
        Date birthDate = null;
        try {
            birthDate = sdf.parse(birthDateStr);
        } catch (Exception e) {
            System.out.println("Invalid date format. Setting birth date to null.");
        }

        Person person = new Person(name, birthDate);

        System.out.println("\nPerson Details:");
        System.out.println(person);

        System.out.print("\nEnter college graduate's GPA: ");
        double gpa = sc.nextDouble();

        System.out.print("Enter college graduate's graduation year: ");
        int graduationYear = sc.nextInt();
        sc.nextLine();

        CollegeGraduate grad = new CollegeGraduate(name, birthDate, gpa, graduationYear);

        System.out.println("\nCollege Graduate Details:");
        System.out.println(grad);

        sc.close();
    }
}
