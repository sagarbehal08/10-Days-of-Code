package TenDayOfCode;
import java.util.Scanner;
public class PiyushAndMagicalPark {
	public static void find(char[][] arr,int row,int col,int k,int s)
	{
		boolean success=true;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(s<k)
				{
					success=false;
					break;
				}
				char ch=arr[i][j];
				if(ch == '*')
				{
					s+=5;
				}
				else if(ch == '.')
				{
					s-=2;
				}
				else
				{
					break;
				}

				if(j!=col-1)
				{
					s-=1;
				}
			}
		}

		if(success)
		{
			System.out.println("Yes");
			System.out.println(s);
		}
		else
		{
			System.out.println("No");
		}
	}

    public static void main(String args[]) {
       Scanner o=new Scanner(System.in);
	   int row=o.nextInt();
	   int col=o.nextInt();
	   int k=o.nextInt();
	   int s=o.nextInt();
	   char arr[][]=new char[row][col];
	   for(int i=0;i<row;i++)
	   {
		   for(int j=0;j<col;j++)
		   {
			   arr[i][j]=o.next().charAt(0);
		   }
	   }
	   find(arr,row,col,k,s);
    }
}
