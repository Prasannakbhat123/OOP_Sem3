import java.util.Scanner;

class Program3{
	static int fact(int n){
		int i,factorial=1;
		for(i=1;i<=n;i++){
			factorial=factorial*i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int factorial=fact(num);
		System.out.println("Factorial = "+factorial);
		System.out.println("Enter the value of n and c in nCr");
		int n=sc.nextInt();
		int r=sc.nextInt();

		int nfact=fact(n);
		int nrfact=fact(n-r);
		int rfact=fact(r);

		int ncr=(nfact)/(rfact*nrfact);
		System.out.println("Value of nCr = "+ncr);
	}
}