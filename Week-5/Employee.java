import java.util.Scanner;

class Employee
{
	String sname;


	Employee(String sname){
		this.sname=sname;
	}

	String lower=this.sname.toLowerCase();

	void formatEmployeeName(){
		
		String result;

		String[] words=lower.split("\\s");

		for(String word: words){
			result.append(Character.toTitleCase(word.charAt(0))) 
                  .append(word.substring(1)) 
                  .append(" "); 
		}

		System.out.println("Employee Name:"+result);

	}

	void generateEmail(){

		String mail;

		String[] names=lower.split("\\s");

		mail.append(names[0].charAt(0));
		mail.append(names[1]);
		mail.append("@example.com");

		System.out.println("Employee Mail:"+mail);

	}

}

class EmployeeDemo
{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Employee Name:");
		String name=sc.next();

		Employee ob=new Employee(name);

		ob.formatEmployeeName();

		ob.generateEmail();
	}
}
