package com.codechef.STPAR;

// problem :: https://www.codechef.com/problems/STPAR
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

			Stack<Integer> stack = new Stack<Integer>();
			Stack<Integer> stack2 = new Stack<Integer>();

			int input_N = scanner.nextInt();

			for (int i = 0; i < input_N; i++) {
				int input_a = scanner.nextInt();
				if (stack.isEmpty()) {
					if (input_a == 1) {
						stack.push(input_a);
					} else {
						stack2.push(input_a);
					}
				} else if (input_a == stack.peek() + 1) {
					stack.push(input_a);
				} else {
					stack2.push(input_a);
				}

				while (true) {
					if (!stack2.isEmpty() && !stack.isEmpty() && stack2.peek() == stack.peek() + 1) {
						stack.push(stack2.pop());
					} else {
						break;
					}
				}

			}

			if (stack.size() == input_N && stack2.size() == 0) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

		}
		System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
	}

}
