package Pattern;

import java.util.Scanner;

public class pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pattern3(5);
//
//	}
//	static void pattern3(int n) {
//		for(int row = 1; row <= n; row++) {
//			for(int col = 1; col <= n-row+1; col++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		while (row <= n) {
			int i = 1;
			while (i <=star) {
				System.out.print("*" + " ");
				i++;

				
			}
			row++;
			System.out.println();
			star--;

		}
		
	}
	

}
