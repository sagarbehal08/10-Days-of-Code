package TenDayOfCode;
import java.util.Scanner;
public class GaneshPattern {
	public static void main(String args[])
	{
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
	    
		//First Component
		//Star
        System.out.print("*");
		//Spaces
		for(int i=1;i<=(n-3)/2;i++)
		{
			System.out.print(" ");
		}
		//Stars
		for(int i=1;i<=(n+1)/2;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		//Second Component
		for(int row=1;row<=(n-3)/2;row++)
		{
			System.out.print("*");
			for(int i=1;i<=(n-3)/2;i++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}

		//Third Component
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
		}
		System.out.println();

		//Forth Component
		for(int row=1;row<=(n-3)/2;row++)
		{
			//Spaces
			for(int i=1;i<=((n-3)/2)+1;i++)
			{
				System.out.print(" ");
			}
			//Star
			System.out.print("*");
			//Spaces
			for(int i=1;i<=(n-3)/2;i++)
			{
				System.out.print(" ");
			}
			//Star
			System.out.print("*");
			System.out.println();
		}

		//Fifth Component
		//Stars
		for(int i=1;i<=(n+1)/2;i++){
			System.out.print("*");
		}
		//Spaces
		for(int i=1;i<=(n-3)/2;i++)
		{
			System.out.print(" ");
		}
		//Star
		System.out.print("*");


	}
}
