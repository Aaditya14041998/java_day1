import java.util.Scanner;

public class array {

	public static void acceptdata(int[] arr) {
		Scanner sc = new Scanner(System.in);
		// accept data
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter number");
			arr[i] = sc.nextInt();
		}
	}

	public static void displayData(int[] arr) {
		// display data
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		int arr[] = new int[5];
		acceptdata(arr);
		displayData(arr);
	}

}