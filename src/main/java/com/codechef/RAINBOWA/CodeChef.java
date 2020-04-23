package com.codechef.RAINBOWA;

// problem :: https://www.codechef.com/problems/RAINBOWA
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

		String input = "" + CodeChef.class.getResource("input.txt");
		input = input.replace("file:", "");
		InputStream is = DEBUG ? new FileInputStream(input) : System.in;

		try (Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(is)))) {

			int input_T = scanner.nextInt();
			while (input_T-- > 0) {
				int N = scanner.nextInt();
				int a[] = new int[N + 1];
				for (int i = 0; i < N; i++)
					a[i] = scanner.nextInt();

				int start = 0;
				int end = N - 1;

				boolean ans = true;
				int num = 1;
				while (num <= 7) {
					if (a[start] != num || a[end] != num) {
						ans = false;
						break;
					}

					int count = 0;
					while (start < N) {
						if (a[start] == num) {
							count++;
							start++;
						} else
							break;
					}

					while (end >= 0) {
						if (a[end] == num) {
							count--;
							end--;
						} else
							break;
					}

					if (count != 0) {
						ans = false;
						break;
					}

					num++;
				}

				if (start < end)
					ans = false;

				System.out.println(ans ? "yes" : "no");

			}

		}

		System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
	}
}
