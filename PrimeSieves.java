package TenDayOfCode;

import java.util.Scanner;

public class PrimeSieves {
    public static void primeSeives(int[] p)
    {	//Mark all odd's numbers prime
    	for(int i=3;i<=1000000;i+=2)
    	{
    		p[(int) i]=1;
    	}
    	
    	for(long i=3;i<=1000000;i+=2)
    	{
    		if(p[(int) i]==1)
    		{
    			for(long j=i*i;j<=1000000;j+=i)
    			{
    				p[(int) j]=0;
    			}
    		}
    	}
    	p[2]=1;
    	p[0]=p[1]=0;
    }
	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		int[] p=new int[1000005];
		primeSeives(p);
		for(int i=0;i<=n;i++)
		{
			if(p[i]==1)
			{
				System.out.println("Prime Number ==> "+i);
			}
		}

	}

}
