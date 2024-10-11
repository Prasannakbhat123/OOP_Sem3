import java.util.Scanner;

class Additional1{
	public static void main(String[] args) {
		int count=0,c;
		Scanner sc=new Scanner(System.in);
		int a[][]= new int[10][];
		for(int i=0;i<10;i++,count++){
			a[i]=new int[count];
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=i+j;
			}
		}
		System.out.println("The matrix is: ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}