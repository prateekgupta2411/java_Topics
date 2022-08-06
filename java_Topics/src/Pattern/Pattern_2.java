package Pattern;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pattern2(5);
//
//	}
//
//	static void pattern2(int n) {
//		for (int row = 1; row <= n; row++) {
//			// for every row, run the col
//			for (int col = 1; col <= n; col++) {
//				System.out.print("* ");
//
//			}
//			// when one is printed, we need to add a new line
//			System.out.println();
//		}
		
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int row =1;
			while(row <= n) {
				int col =1;
				while(col <= n) {
				System.out.print("*"+ " ");
				col++;
			}
				row++;
			System.out.println();
			}
			
		}
}
