package com.codechef.CHN15A;

// problem :: https://www.codechef.com/problems/CHN15A
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

			// input number of tests
			int input_T = scanner.nextInt();

			// loop over tests
			while (input_T-- > 0) {

				// input number of minions
				int input_N = scanner.nextInt();

				// input number K
				int input_K = scanner.nextInt();

				int result = 0;

				while (input_N-- > 0) {
					int Wj = scanner.nextInt();
					if ((Wj + input_K) % 7 == 0) {
						result++;
					}
				}

				System.out.println(result);
			}

		}

		System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
	}
}