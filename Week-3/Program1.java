import java.util.Scanner;
class Student{
	String sname;
	int [] marks_array;
	int total;
	double avg;

	void assign(String sname,int [] marks_array){
		this.sname=sname;
		this.marks_array=marks_array;
	}

	void compute(){
		total=0;
		for(int submarks:marks_array)
			total+=submarks;
		avg=(double)total/marks_array.length;
	}

	void display(){
		System.out.println("\nStudent Details:");
		System.out.println("\nName: "+sname);
		System.out.println("\nMarks: ");
		for (int submark:marks_array) {
			System.out.print(submark+"\n");
		}
		System.out.println("\nTotal Marks: "+total);
		System.out.println("\nAverage Marks: "+avg);
	}
}

class Program1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student student=new Student();
		System.out.println("\nEnter student name: ");
		String name=sc.nextLine();
		System.out.println("\nEnter number of subjects: ");
		int numSub=sc.nextInt();
		int [] marks=new int[numSub];
		for (int j=0;j<numSub ;j++ ) {
			System.out.println("\nEnter sub "+(j+1)+" marks");
				marks[j]=sc.nextInt();
		}
		student.assign(name,marks);
		student.compute();
		student.display();
	}
}