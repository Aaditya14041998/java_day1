import java.util.Scanner;

public class array2D {

	public static void acceptdata(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		// accept data
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				System.out.println("enter number");
				arr[i][j] = sc.nextInt();
			}
		}
	}

	public static void displayData(int[][] arr) {
		// display data
		for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		acceptdata(arr);
		displayData(arr);
	}

}