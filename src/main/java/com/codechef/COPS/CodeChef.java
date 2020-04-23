package com.codechef.COPS;

//problem :: https://www.codechef.com/problems/COPS
//blog post ::
//youtube tutorial ::

//don't copy above this line

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
				int input_M = scanner.nextInt();
				int input_x = scanner.nextInt();
				int input_y = scanner.nextInt();

				boolean[] flags = new boolean[101];
				int span = input_x * input_y;

				for (int i = 0; i < input_M; i++) {
					int a = scanner.nextInt();
					int lowerBound = a - span;
					int upperBound = a + span;
					if (lowerBound < 1) {
						lowerBound = 1;
					}
					if (upperBound > 100) {
						upperBound = 100;
					}
					for (int j = lowerBound; j <= upperBound; j++) {
						flags[j] = true;
					}
				}

				int result = 0;
				for (int i = 1; i < 101; i++) {
					boolean b = flags[i];
					if (!b) {
						result++;
					}
				}

				System.out.println(result);

			}
		}
		System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
	}
	
}