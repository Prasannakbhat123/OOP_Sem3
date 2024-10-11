import java.util.*;

class Building{
	int sqfootages;
	int stories;

	Scanner sc=new Scanner(System.in);

	Building(){
		sqfootages=-1;
		stories=-1;
	}

	void assign(){
		System.out.print("Enter the number of square footages: ");
		sqfootages=sc.nextInt();
		System.out.print("Enter the number of stories: ");
		stories=sc.nextInt();
	}

	void display(){
		System.out.print("Square footages: "+sqfootages+"\tStories: "+stories+"\n");
	}
}

class House extends Building{
	int bedrooms,baths;
	Scanner sc=new Scanner(System.in);

	House(){
		super();
		bedrooms=-1;
		baths=-1;
	}

	void assign(){
		super.assign();
		System.out.print("Enter number of bedrooms: ");
		bedrooms=sc.nextInt();
		System.out.print("Enter number ot bathrooms: ");
		baths=sc.nextInt();
	}

	void display(){
		super.display();
		System.out.print("Bedrooms: "+bedrooms+"\tBathrooms: "+baths+"\n");
	}
}

class School extends Building{
	int noOfClass;
	String grade;
	Scanner sc=new Scanner(System.in);
	School(){
		super();
		noOfClass=-1;
		grade="default";
	}

	void assign(){
		super.assign();
		System.out.print("Enter number of Classes: ");
		noOfClass=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the grades: ");
		grade=sc.nextLine();
	}

	void display(){
		super.display();
		System.out.println("Classes: "+noOfClass+"\tGrades: "+grade+"\n");
	}
}

class Program4{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("1.Building 2.House 3. School :");
		int choice =sc.nextInt();
		Building obj= new Building();
		if(choice==1){
			obj.assign();
			obj.display();
		}

		else if(choice ==2){
			House h=new House();
			h.assign();
			h.display();
		}

		else if(choice==3){
			School s=new School();
			s.assign();
			s.display();
		}
		else {
			System.out.print("Invalid Choice");
		}
	}
}