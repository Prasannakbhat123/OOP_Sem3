import java.util.Scanner;

class Employee{
	String ename;
	int eid;
	double basic,da,gross_sal,net_sal;
	void read(){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter employee name: ");
		ename=sc.nextLine();
		System.out.print("\nEnter employee ID: ");
		eid=sc.nextInt();
		System.out.print("\nEnter Basic Salary: ");
		basic=sc.nextDouble();
		compute();
	}

	public void compute(){
		da=0.52*basic;
		gross_sal=basic+da;
		double it=0.30*gross_sal;
		net_sal=gross_sal-it;
	}

	public void display(){
		
		System.out.print("\nEmployee name: "+ename);
		System.out.print("\nEmployee ID: "+eid);
		System.out.printf("\nBasic Salary: %2f",basic);
		System.out.printf("\nDA: %2f",da);
		System.out.printf("\nGross Salary: %2f",gross_sal);
		System.out.printf("\nNet Salary: %2f",net_sal);
		System.out.println("");
	}


}

class Program2{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of employees: ");
	int n=sc.nextInt();
	Employee[] employees=new Employee[n];
	for (int i=0;i<n ;i++ ) {
		employees[i]=new Employee();
		employees[i].read();
	}
	int count=1;
	for (Employee emp :employees ) {
		System.out.print("\nEmployee "+count+ " Details: ");
		emp.display();
		count++;
	}
}
}
