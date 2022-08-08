package Practice_Pattern;

import java.util.*;

public class Prac_2 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int star = n;
		int space = n - 1;
		int middlespace = 0;

		while (row <= n) {

			int i = 1;
			while (i <= space) {
				System.out.print(" ");
				i++;
			}

			int k = 1;
			if (row == 1 || row == n) {
				star = n;
			} else {
				star = 1;
			}
			while (k <= star) {
				System.out.print("*" + "");
				k++;
			}

			int j = 1;
			if (row == 1 || row == n) {
				middlespace = 0;
			} else {
				middlespace = n - 2;
			}
			while (j <= middlespace) {
				System.out.print(" ");
				j++;
			}

			int p = 1;
			if (row == 1 || row == n) {
				star = 0;
			} else {
				star = 1;
			}
			while (p <= star) {
				System.out.print("*" + "");
				p++;
			}

			row++;
			space = space - 1;
			System.out.println();

		}
	}
}
