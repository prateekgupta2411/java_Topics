package Pattern;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pattern1(5);
//
//	}
//	static void pattern1(int n) {
//		for(int row = 1; row <= n; row++) {
//			// for every row, run the col
//			for(int col = 1; col <= row; col++) {
//				System.out.print("*" + " ");
//				
//			}
//			// when one is printed, we need to add a new line
//			System.out.println();
//		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		while (row <= n) {
			int col = 1;
			while (col <= row) {
				System.out.print("*" + " ");

				col++;
			}
			row++;
			System.out.println();

		}

	}

}
