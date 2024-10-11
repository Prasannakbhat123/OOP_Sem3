import java.util.Scanner;

class Program1{
	static int max(int x, int y, int z){
		if(x>y){
			if(x>z){
				return x;
			}
			else return z;
		}
		if(y>z){
			return y;
		}
		else return z;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int maximum=max(a,b,c);
		System.out.println("Maximum = "+maximum);
	}
}