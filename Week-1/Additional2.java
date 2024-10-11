import java.util.Scanner;

class Additional2{
	static int findSum(int n){
		int i,sum=0,digit;
		while(n>0){
			digit=n%10;
			sum+=digit;
			n/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=findSum(num);
		System.out.println("Sum of digits = "+sum);
	}
}