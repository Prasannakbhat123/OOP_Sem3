import java.util.Scanner;

class Mixer{
	int arr[];
void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N = sc.nextInt();
        int[] tempArr = new int[N];
        int count = 0;

        System.out.println("Enter the elements:");
        for (int i = 0; i < N; i++) {
            int element = sc.nextInt();

            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (tempArr[j] == element) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                tempArr[count++] = element;
            }
        }

        arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = tempArr[i];
        }
    }


	Mixer mix(Mixer a){

        int n = this.arr.length + a.arr.length;
        int[] tempArr = new int[n];
        int count = 0;

        int i = 0, j = 0;
        while (i < this.arr.length && j < a.arr.length) {
            if (this.arr[i] < a.arr[j]) {
                if (count == 0 || tempArr[count - 1] != this.arr[i]) {
                    tempArr[count++] = this.arr[i];
                }
                i++;
            } else if (this.arr[i] > a.arr[j]) {
                if (count == 0 || tempArr[count - 1] != a.arr[j]) {
                    tempArr[count++] = a.arr[j];
                }
                j++;
            } else {
                if (count == 0 || tempArr[count - 1] != this.arr[i]) {
                    tempArr[count++] = this.arr[i];
                }
                i++;
                j++;
            }
        }

        while (i < this.arr.length) {
            if (count == 0 || tempArr[count - 1] != this.arr[i]) {
                tempArr[count++] = this.arr[i];
            }
            i++;
        }

        while (j < a.arr.length) {
            if (count == 0 || tempArr[count - 1] != a.arr[j]) {
                tempArr[count++] = a.arr[j];
            }
            j++;
        }

        Mixer ob = new Mixer();
        ob.arr = new int[count];
        for (int k = 0; k < count; k++) {
            ob.arr[k] = tempArr[k];
        }
        return ob;
    }

	void display(){
		for(int k:arr){
			System.out.print(k+ " ");
		}
	}
}

class Program3{
		public static void main(String[] args) {
			System.out.print("\nFirst Array: \n");
			Mixer x=new Mixer();
			x.accept();
			x.display();
			System.out.print("\nSecond Array: \n");
			Mixer y=new Mixer();
			y.accept();
			y.display();
			Mixer z=x.mix(y);
			System.out.println("Result: ");
			z.display();

		}
	}
