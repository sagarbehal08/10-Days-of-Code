package TenDayOfCode;

import java.util.Scanner;

public class TrailingZeroes {
	public static void findZeroes(long n) {
		int ans = 0;
		int p = 5;
		while ((n / p) > 0) {
			ans += n / p;
			p *= 5;
		}
		System.out.println(ans);
	}

	public static void main(String args[]) {
		Scanner o = new Scanner(System.in);
		long n = o.nextLong();
		findZeroes(n);
	}
}
