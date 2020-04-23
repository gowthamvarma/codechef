package com.codechef.LAPIN;

// problem :: https://www.codechef.com/problems/LAPIN
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
				boolean res = true;
				String input_string = scanner.next();

				int len = input_string.length();
				int len2 = len % 2 == 0 ? len / 2 : len / 2 + 1;

				char[] arr1 = input_string.substring(0, len / 2).toCharArray();
				char[] arr2 = input_string.substring(len2, len).toCharArray();

				Arrays.sort(arr1);
				Arrays.sort(arr2);

				for (int j = 0; j < arr1.length; j++) {
					if (arr1[j] != arr2[j]) {
						res = false;
						break;
					}
				}

				System.out.println(res ? "YES " : "NO ");
			}
			System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
		}
	}
}