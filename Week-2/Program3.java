import java.util.Scanner;

class Program3{

	public static boolean isPrime(int n){
		int j;
		if(n==1) return false;
		if(n==2) return true;
		for(j=2;j<=n/2;j++){
			if(n%j==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0; i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Prime numbers are: ");
		for(int i=0; i<n;i++){
			if(isPrime(arr[i])) System.out.print(arr[i]+" ");
		}

	}
}