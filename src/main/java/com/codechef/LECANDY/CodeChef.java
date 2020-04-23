package com.codechef.LECANDY;

// problem :: https://www.codechef.com/problems/LECANDY
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
				int input_N = scanner.nextInt();
				int input_C = scanner.nextInt();
				int[] input_A = new int[input_N];
				for (int i = 0; i < input_N; i++) {
					input_A[i] = scanner.nextInt();
				}

				int sum = Arrays.stream(input_A).sum();

				System.out.println(input_C >= sum ? "Yes" : "No");
			}
		}

		System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
	}

}