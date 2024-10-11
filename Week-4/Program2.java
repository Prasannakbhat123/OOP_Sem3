import java.util.Scanner;

class Employee{
	String ename;
	int eid;
	double basic,da,gross_sal,net_sal;

	Employee(){
		System.out.print("Inside default Constructor:");
		ename="def_constructor";
		eid=0;
		basic=15000;
	}

	Employee(String name, int id, double bas){
		ename=name;
		eid=id;
		basic=bas;
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
	int id;
	double basic;
	String name;
	Employee emp1=new Employee();
	emp1.compute();
	emp1.display();
	System.out.println("\nEnter Employee name, id, basic salary: ");
	name=sc.next();
	id=sc.nextInt();
	basic=sc.nextDouble();
	
	Employee emp2=new Employee(name,id,basic);
	emp2.compute();
	emp2.display();
}
}
