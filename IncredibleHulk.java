package TenDayOfCode;
import java.util.Scanner;
public class IncredibleHulk {
	public static void countBitsFast(int n)
	{	int ans=0;
		while(n>0)
		{
			n=n&(n-1);
			ans++;
		}
		System.out.println(ans);
	}
    public static void main(String args[]) {
       Scanner o=new Scanner(System.in);
	   int t=o.nextInt();
	   for(int i=0;i<t;i++)
	   {
		   int n=o.nextInt();
		   countBitsFast(n);
	   }
    }
}
