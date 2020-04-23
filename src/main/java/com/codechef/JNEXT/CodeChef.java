package com.codechef.JNEXT;

// problem :: https://www.codechef.com/problems/JNEXT
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
			int T = scanner.nextInt();

			for (int i = 0; i < T; i++) {
				int N = scanner.nextInt();
				int[] arr = new int[N];
				for (int j = 0; j < N; j++) {
					arr[j] = scanner.nextInt();
				}
				boolean res = Nextperm.nextPermutation(arr);

				if (res) {
					for (int j = 0; j < arr.length; j++) {
						System.out.print(arr[j]);
					}
				} else {
					System.out.print("-1");
				}

				System.out.println("");
			}
		}

		System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
	}
}

class Nextperm {

	/* Basic integer array version */
	/**
	 * Computes the next lexicographical permutation of the specified array of
	 * integers in place, returning whether a next permutation existed. (Returns
	 * {@code false} when the argument is already the last possible permutation.)
	 * 
	 * @param array the array of integers to permute
	 * @return whether the array was permuted to the next permutation
	 */
	public static boolean nextPermutation(int[] array) {
		// Find non-increasing suffix
		int i = array.length - 1;
		while (i > 0 && array[i - 1] >= array[i])
			i--;
		if (i <= 0)
			return false;

		// Find successor to pivot
		int j = array.length - 1;
		while (array[j] <= array[i - 1])
			j--;
		int temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = temp;

		// Reverse suffix
		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		return true;
	}

	/* Generic array version */
	public static <T extends Comparable<? super T>> boolean nextPermutation(T[] array) {
		// Find non-increasing suffix
		int i = array.length - 1;
		while (i > 0 && array[i - 1].compareTo(array[i]) >= 0)
			i--;
		if (i <= 0)
			return false;

		// Find successor to pivot
		int j = array.length - 1;
		while (array[j].compareTo(array[i - 1]) <= 0)
			j--;
		T temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = temp;

		// Reverse suffix
		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		return true;
	}

	/* Generic list version */
	public static <T extends Comparable<? super T>> boolean nextPermutation(List<T> array) {
		// Find non-increasing suffix
		int i = array.size() - 1;
		while (i > 0 && array.get(i - 1).compareTo(array.get(i)) >= 0)
			i--;
		if (i <= 0)
			return false;

		// Find successor to pivot
		int j = array.size() - 1;
		while (array.get(j).compareTo(array.get(i - 1)) <= 0)
			j--;
		Collections.swap(array, i - 1, j);

		// Reverse suffix
		Collections.reverse(array.subList(i, array.size()));
		return true;
	}

	/* Generic list version with comparator */
	public static <T> boolean nextPermutation(List<T> array, Comparator<T> comp) {
		// Find non-increasing suffix
		int i = array.size() - 1;
		while (i > 0 && comp.compare(array.get(i - 1), array.get(i)) >= 0)
			i--;
		if (i <= 0)
			return false;

		// Find successor to pivot
		int j = array.size() - 1;
		while (comp.compare(array.get(j), array.get(i - 1)) <= 0)
			j--;
		Collections.swap(array, i - 1, j);

		// Reverse suffix
		Collections.reverse(array.subList(i, array.size()));
		return true;
	}

}