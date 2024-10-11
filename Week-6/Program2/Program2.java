import java.util.Scanner;

class Employee {
    String ename;
    int eid;
    double basic, da, gross_sal, net_sal;

    // Default constructor
    Employee() {}

    // Constructor for full-time employee
    Employee(String n, int i, double sal) {
        ename = n;
        eid = i;
        basic = sal;
        compute();
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter employee name: ");
        ename = sc.nextLine();
        System.out.print("\nEnter employee ID: ");
        eid = sc.nextInt();
        System.out.print("\nEnter Basic Salary: ");
        basic = sc.nextDouble();
        compute();
    }

    public void compute() {
        da = 0.52 * basic;
        gross_sal = basic + da;
        double it = 0.30 * gross_sal;
        net_sal = gross_sal - it;
    }

    public void display() {
        System.out.print("\nEmployee name: " + ename);
        System.out.print("\nEmployee ID: " + eid);
        System.out.printf("\nBasic Salary: %.2f", basic);
        System.out.printf("\nDA: %.2f", da);
        System.out.printf("\nGross Salary: %.2f", gross_sal);
        System.out.printf("\nNet Salary: %.2f", net_sal);
        System.out.println("");
    }
}

class PartTimeEmp extends Employee {
    private int hoursWorked;
    private static final double hourlyRate = 20.0;

    public PartTimeEmp(String name, int id, int hours) {
        super(name, id, 0.0); // Part-time employees have no basic salary
        hoursWorked = hours;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public void displayEmployeeDetails() {
        super.display();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.printf("Salary: %.2f", calculateSalary());
        System.out.println();
    }
}

class FullTimeEmp extends Employee {
    private double bonus;
    private double deductions;

    public FullTimeEmp(String n, int i, double sal, double bon, double ded) {
        super(n, i, sal);
        bonus = bon;
        deductions = ded;
    }

    @Override
    public void compute() {
        super.compute();
        gross_sal += bonus; // Add bonus to gross salary
        net_sal = gross_sal - deductions; // Deduct deductions from gross salary
    }

    public double calculateSalary() {
        return gross_sal; // Gross salary including bonus but after deductions
    }

    public void displayEmployeeDetails() {
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Deductions: " + deductions);
        System.out.printf("Salary: %.2f", calculateSalary());
        System.out.println();
    }
}

class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline

        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Is this a full-time employee (yes/no)? ");
            String type = sc.nextLine();

            if (type.equalsIgnoreCase("yes")) {
                System.out.print("Enter Full-Time Employee Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Full-Time Employee ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Basic Salary: ");
                double sal = sc.nextDouble();
                System.out.print("Enter Bonus: ");
                double bonus = sc.nextDouble();
                System.out.print("Enter Deductions: ");
                double deductions = sc.nextDouble();
                sc.nextLine(); // Consume the newline

                employees[i] = new FullTimeEmp(name, id, sal, bonus, deductions);
            } else {
                System.out.print("Enter Part-Time Employee Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Part-Time Employee ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Hours Worked: ");
                int hours = sc.nextInt();
                sc.nextLine(); // Consume the newline

                employees[i] = new PartTimeEmp(name, id, hours);
            }
        }

        int count = 1;
        for (Employee emp : employees) {
            System.out.println("\nEmployee " + count + " Details:");
            if (emp instanceof FullTimeEmp) {
                ((FullTimeEmp) emp).displayEmployeeDetails();
            } else if (emp instanceof PartTimeEmp) {
                ((PartTimeEmp) emp).displayEmployeeDetails();
            }
            count++;
        }

        sc.close();
    }
}
