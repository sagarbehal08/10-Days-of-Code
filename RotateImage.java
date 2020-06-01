package TenDayOfCode;

import java.util.Scanner;

public class RotateImage {
	public void rotate(int [][]arr,int n)
	{
		for(int row=0;row<n;row++)
		{
			int start=0;
			int end=n-1;
			while(start<end)
			{
				int temp=arr[row][start];
				arr[row][start]=arr[row][end];
				arr[row][end]=temp;
				start++;
				end--;
			}
		}

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i<j)
				{
					int temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				}
			}
		}

		for(int i=0;i<n;i++)
	   {
		   for(int j=0;j<n;j++)
		   {
			   System.out.print(arr[i][j]+" ");
		   }
		   System.out.println();
	   }
	}
	public void swap(int num1,int num2)
	{
		int temp=num1;
		num1=num2;
		num2=temp;
		return;
	}
    public static void main(String args[]) {
    	RotateImage r=new RotateImage();
       Scanner o=new Scanner(System.in);
	   int n=o.nextInt();
	   int [][]arr=new int[n][n];
	   for(int i=0;i<n;i++)
	   {
		   for(int j=0;j<n;j++)
		   {
			   arr[i][j]=o.nextInt();
		   }
	   }
	   r.rotate(arr,n);

	   
    }
}
