import java.util.Scanner;

class Program4{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the row size of the two arras: ");
		int m=sc.nextInt();
		System.out.println("Enter the column size of the two arrays: ");
		int n=sc.nextInt();
		System.out.print("Enter the elements: ");

		int a[][]= new int[m][n];
		for(int i=0;i<m;i++){
			for (int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}

		System.out.print("Enter the elements: ");

		int b[][]= new int[m][n];
		for(int i=0;i<m;i++){
			for (int j=0;j<n;j++){
				b[i][j]=sc.nextInt();
			}
		}

		int c[][]=new int[m][n];
		for(int i=0;i<m;i++){
			for (int j=0;j<n;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}

		System.out.println("The sum of the two matrix is: ");
		for(int i[]: c){
			for(int ele:i){
				System.out.print(ele+" ");
			}
			System.out.println();
		}




	}
}