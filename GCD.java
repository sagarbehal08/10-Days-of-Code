package TenDayOfCode;

import java.util.Scanner;

public class GCD {
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static void main(String args[]) {
		Scanner o = new Scanner(System.in);
		int a = o.nextInt();
		int b = o.nextInt();
		System.out.print(gcd(a, b));
	}
}
