package com.codechef.CSUB;

//problem :: https://www.codechef.com/problems/CSUB
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
				int input_N = scanner.nextInt();

				String input_string = scanner.next();
				long count_one = 0;
				for (int i = 0; i < input_N; i++) {
					if (input_string.charAt(i) == '1') {
						count_one++;
					}
				}

				System.out.println((count_one * (count_one + 1)) / 2);

			}

		}
		System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
	}

}
