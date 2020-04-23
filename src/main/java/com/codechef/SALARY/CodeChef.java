package com.codechef.SALARY;

//problem :: https://www.codechef.com/problems/SALARY
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

			// input number of tests
			int input_T = scanner.nextInt();

			// loop over tests
			while (input_T-- > 0) {

				// input number of workers
				int input_N = scanner.nextInt();

				// init sum and minimum
				// since each salary is <= 10000
				// minimum could be init by 10000
				int sumW = 0, minW = 10000;

				for (int i = 0; i < input_N; ++i) {

					// input salary of i-th worker
					int Wi;
					Wi = scanner.nextInt();

					// update sum and minimum
					sumW += Wi;
					minW = Math.min(minW, Wi);
				}

				// output the result
				int res = sumW - input_N * minW;
				System.out.println(res);
			}
		}
		System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
	}

}