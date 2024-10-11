import java.util.*;
abstract class Figure{
	int a,b;
	abstract int area();
}

class Rectangle extends Figure{
	Rectangle(int x, int y){
		a=x;
		b=y;
	}

	int area(){
		return (a*b);
	}
}

class Triangle extends Figure{
	Triangle(int x, int y){
		a=x;
		b=y;
	}
	int area(){
		return ((int)a*b/2);
	}
}

class Square extends Figure{
	Square(int x){
		a=x;
	}

	int area(){
		return (a*a);
	}
}

class Program5{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("1.Rectangle 2.Triangle 3.Square: ");
		int choice=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the first dimension ");
        int a = sc.nextInt();
        System.out.print("Enter the second dimension ");
        int b = sc.nextInt();
        sc.nextLine();
        if(choice==1){
        	Rectangle r=new Rectangle(a,b);
        	System.out.print("Area= "+r.area());
        }
        if(choice==2){
        	Triangle t=new Triangle(a,b);
        	System.out.print("Area= "+t.area());
        }
        if(choice==3){
        	Square s=new Square(a);
        	System.out.print("Area= "+s.area());
        }
        else{
        	System.out.print("Invalid");
        }

	}
}