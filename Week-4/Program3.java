import java.util.Scanner;
class Bank{
	String name,actype;
	int acno;
	double bal=0.0;
	double deposit=0.0,withdraw;
	static double rate=0.09;

	Bank(){
		name="def_con";
		acno=100;
		actype="savings";
		bal=0;
	}

	Bank(String acname,int acnum, String acty, double balance){
		name=acname;
		acno=acnum;
		actype=acty;
		bal=balance;
	}

	void deposit(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the deposit amount: ");
		deposit=sc.nextDouble();
		bal+=deposit;
	}

	void withdraw(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the withdraw amount: ");
		withdraw=sc.nextDouble();
		if(withdraw<=bal){
			System.out.println("Collect the amount ");
			bal-=withdraw;
		}

		else
			System.out.println("Insufficient Balance");
	}

	void display(){
		System.out.println("Name: "+name);
		System.out.println("Account number: "+acno);
		System.out.println("Account type: "+actype);
		System.out.println("Balance: "+bal);
	}

	void rate(){
		System.out.println("Rate of Interest: "+rate*bal);
	}
}

class Program3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank B1=new Bank();
		String name,actype;
		int acno;
		double bal;
		System.out.println("For B2\nEnter name: ");
		name=sc.nextLine();
		System.out.println("Enter Account type: ");
		actype=sc.nextLine();
		System.out.println("Enter Account number: ");
		acno=sc.nextInt();
		System.out.println("Enter the deposit amount: ");
		bal=sc.nextDouble();
		Bank B2=new Bank(name,acno,actype,bal);
		System.out.println("B2: ");
		B2.withdraw();
		B2.display();
		B2.rate();

		System.out.println("B1: ");
		B1.deposit();
		B1.withdraw();
		B1.rate();
		
	}
}