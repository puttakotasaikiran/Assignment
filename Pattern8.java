package Assignment2;
import java.util.Scanner;
class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows: ");
	int n = sc.nextInt();
    int rowsCount=n;
	sc.close();
	for (int i = 0; i < n; i++) {
	

		for (int j = 1; j <= i * 2; j++) {
			System.out.print(" ");
		}

		

		for (int j = 1; j <= rowsCount; j++) {
			System.out.print(j + " ");
		}

		

		for (int j = rowsCount - 1; j >= 1; j--) {
			System.out.print(j + " ");
		}

		System.out.println();

	

		rowsCount--;
	}
}
}
