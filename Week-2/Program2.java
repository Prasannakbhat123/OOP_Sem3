import java.util.Scanner;

class Program2{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=1,i;

	System.out.print("Enter the size of the array: ");
	int n=sc.nextInt();
	int a[]=new int[n];

	for(i=0;i<n;i++,count++){
		a[i]=count;
	}

	System.out.print("The elements are: ");
		for(int ele:a)
			System.out.print(ele+" ");

}
}
