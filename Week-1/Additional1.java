import java.util.Scanner;

class Additional1{
	static boolean isPrime(int n){
		int i;
		boolean result=true;
		for(i=2;i<=n/2;i++){
			if(n%i==0){
				result=false;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		boolean prime=isPrime(num);
		if(prime) System.out.println("It is a prime number");
		else System.out.println("It is not a prime number");
		for(int i=3;i<=num;i++){
			boolean res=isPrime(i);
			if(res){
				System.out.println(i);
			}
		}
	}
}