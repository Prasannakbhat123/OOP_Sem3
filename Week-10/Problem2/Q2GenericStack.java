import java.util.*;
class Stack<T>{
	private T[] st;
	private int tos;
	private int max;

	Stack(int n){
		tos=-1;
		max=n;
		st=(T[])new Object[n];
	}

	void push(T data){
		if(tos+1==max){
			System.out.println("Stack Overflow");
			return;
		}
		tos+=1;
		st[tos]=data;
	}
	T pop(){
		if(tos==-1){
			System.out.print("Stack Underflow");
			return null;
		}
		T data =st[tos];
		tos-=1;
		return data;
	}
}

class Student{
	String name;
	int rollno;
	Student(String n,int r){
		name=n;
		rollno=r;
	}
}


class Employee{
	String name;
	int id;
	Employee(String n, int i){
		name=n;
		id=i;
	}
}

public class Q2GenericStack{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter max stack size: ");
		int n=sc.nextInt();
		Stack<Student> studentStack=new Stack<>(n);
		Stack<Employee> employeeStack=new Stack<>(n);
		System.out.print("1. Push Student, 2. Pop Student, 3. Push Employee, 4. Pop Employee, -1. Exit");
		int inp;
		Student temp1;
		Employee temp2;

		do{
			System.out.print("\nEnter choice: ");
			inp=sc.nextInt();
			if(inp==1){
				System.out.print("Enter student's name: ");
				String t=sc.next();
				System.out.print("Enter student's roll number:");
				temp1=new Student(t,sc.nextInt());
				studentStack.push(temp1);
			}
			else if(inp==2){
				temp1=studentStack.pop();
				if(temp1!=null){
					System.out.print("\nPopped: Name: "+temp1.name+"\tRoll number: "+temp1.rollno);
				}
			}else if(inp==3){
				System.out.print("\nEnter employee's name: ");
				String t=sc.next();
				System.out.print("Enter employee's id:");
				temp2=new Employee(t,sc.nextInt());
				employeeStack.push(temp2);
			}else if(inp==4){
				temp2=employeeStack.pop();
				if(temp2!=null){
					System.out.print("\nPopped: Name: "+temp2.name+"\tID: "+temp2.id);
				}
			}else{
				inp=-1;
			}

		}
		while(inp!=-1);
	}
}