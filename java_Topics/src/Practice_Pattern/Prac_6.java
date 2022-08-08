package Practice_Pattern;

import java.util.Scanner;


public class Prac_6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y=sc.nextInt();
        int count=0;
        int rem;
        if(x==0&&y==0)
        	++count;
        while(x%10>0)
        {
        	rem=x%10;

        	if(rem==y)
        		++count;
        	x=x/10;
        }
       
        System.out.println(count);
    }
	}