package com.codechef.FRGTNLNG;

// problem :: https://www.codechef.com/problems/FRGTNLNG
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
				int input_K = scanner.nextInt();

				String[] a = new String[input_N];
				Set<String> completeSet = new HashSet<String>();

				for (int i = 0; i < input_N; i++) {
					a[i] = scanner.next();
				}

				for (int i = 0; i < input_K; i++) {
					int L = scanner.nextInt();
					for (int j = 0; j < L; j++) {
						String str = scanner.next();
						completeSet.add(str);
					}
				}

				for (int i = 0; i < input_N; i++) {
					System.out.print(completeSet.contains(a[i]) ? "YES " : "NO ");
				}
				System.out.println("");
			}
		}

		System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
	}
}