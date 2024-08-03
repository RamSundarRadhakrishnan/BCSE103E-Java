import java.util.Scanner;
public class Array1{
	public static void main(String[] args){
			Scanner myscanner = new Scanner(System.in);
			int size;
			System.out.println("Enter the size of the array: ");
			size = myscanner.nextInt();
			int[] arr = new int[size];
			for(int i=0; i<size; i++){
				System.out.println("Enter element "+i);
				arr[i]=myscanner.nextInt();
			}
			for(int i=0; i<size; i++){
				System.out.printf("Element %d is %d\n", i, arr[i]);
			}
			
	}
}
