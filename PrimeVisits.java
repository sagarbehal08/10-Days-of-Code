package TenDayOfCode;

import java.util.Scanner;

public class PrimeVisits {
	public static void primeSeives(int[] p) {
		for (int i = 3; i <= 1000000; i += 2) {
			p[i] = 1;
		}
		for (long i = 3; i <= 1000000; i += 2) {
			if (p[(int) i] == 1) {
				for (long j = i * i; j <= 1000000; j += i) {
					p[(int) j] = 0;
				}
			}
		}
		p[2] = 1;
		p[0] = p[1] = 0;

	}

	public static void main(String args[]) {
		Scanner o = new Scanner(System.in);

		int p[] = new int[1000005];
		primeSeives(p);
		int csum[] = new int[1000005];
		for (int i = 1; i <= 1000000; i++) {
			csum[i] = csum[i - 1] + p[i];
		}
		int t = o.nextInt();
		for (int i = 0; i < t; i++) {
			int in = o.nextInt();
			int end = o.nextInt();
			System.out.println(csum[end] - csum[in - 1]);
		}
	}
}
