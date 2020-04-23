package com.codechef.CHMOD;

// problem :: https://www.codechef.com/problems/CHMOD
// blog post ::
// youtube tutorial ::

// don't copy above this line

import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef {
	
	// change to false before uploading
	private static final boolean DEBUG = true;
	
	public static void main(String[] args) throws java.lang.Exception {

		long beginTime = System.nanoTime();
		
		String input =  "" + CodeChef.class.getResource("input.txt");
		input = input.replace("file:", "");
		InputStream is = DEBUG ? new FileInputStream(input) : System.in;
		
		try (Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(is)))) {
			int prime[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
					97 };
			int list[][] = new int[101][25];
			int i, j;
			for (i = 2; i <= 100; i++) {
				int copyi = i;
				for (j = 0; j < prime.length; j++) {
					while (copyi % prime[j] == 0) {
						list[i][j]++;
						copyi /= prime[j];
					}
					if (copyi == 1)
						break;
				}
			}

			int n = scanner.nextInt();
			int table[][] = new int[n + 1][25];
			int a[] = new int[n + 1];
			for (i = 1; i <= n; i++) {
				a[i] = scanner.nextInt();
			}
			for (i = 1; i <= n; i++) {
				for (j = 0; j < 25; j++) {
					table[i][j] = list[a[i]][j];
				}
				for (j = 0; j < 25; j++) {
					table[i][j] += table[i - 1][j];
				}
			}

			int t = scanner.nextInt();
			while (t-- > 0) {
				int l, r, m;
				l = scanner.nextInt();
				r = scanner.nextInt();
				m = scanner.nextInt();
				long ans = 1;
				for (j = 0; j < 25; j++) {
					ans = (ans * fastexp(prime[j], table[r][j] - table[l - 1][j], m)) % m;
				}
				System.out.println(ans);
			}
		}

		
		System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
	}

	public static long fastexp(long base, long exp, long MOD) {
		long res = 1;
		while (exp > 0) {
			if (exp % 2 == 1)
				res = res * base % MOD;
			base = (base * base) % MOD;
			exp /= 2;
		}
		return res % MOD;
	}
}
