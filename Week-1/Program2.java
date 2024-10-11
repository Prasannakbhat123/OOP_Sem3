import java.util.Scanner;

class Program2{
	static int reverse(int n){
		int rev=0,digit;
		while(n>0){
			digit=n%10;
			rev=rev*10+digit;
			n/=10;
		}

		return rev;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rev=reverse(n);
		System.out.println("Reversed number = "+rev);
		if(rev==n){
			System.out.println("It is a pallindrome");
		}
		else System.out.println("It is not a pallindrome");
	}
}