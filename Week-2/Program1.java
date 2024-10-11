import java.util.Scanner;

class program1{
	public static void main(String[] args) {
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0; i<n;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<n/2;i++){
			temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}

		System.out.println("The elements are:");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]+" ");

}
}
