package Practice_Pattern;

import java.util.Scanner;

public class Prac_3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int star = n/2+1;
		int space = -1;
		int row = 1;
		
		while(row<=n)
		{
			int i = 1;
			
			while(i<=star)
			{
				System.out.print("*  ");
				i++;
			}
			
			//space//
			
			int j = 1;
			
			while(j<=space)
			{
				System.out.print("   ");
				j++;
			}
			
			//star//
			
			int k = 1;
			
			if(row==1 || row==n)  
			{
				k=2;             
			}
			
			while(k<=star)
			{
				System.out.print("*  ");
				k++;
			}
			if(row<n/2+1)
			{
				star--;
				space += 2;
			}
			else
			{
				star++;
				space -= 2;		
			}
			row++;
			System.out.println();
		}
	}
}
