package com.codechef.CNOTE;

//problem :: https://www.codechef.com/problems/CNOTE
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
		
		String input =  "" + CodeChef.class.getResource("input.txt");
		input = input.replace("file:", "");
		InputStream is = DEBUG ? new FileInputStream(input) : System.in;
		
		try (Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(is)))) {
			
			int input_T = scanner.nextInt();
	
			while(input_T-- > 0) {
				int input_X = scanner.nextInt();
				int input_Y = scanner.nextInt();
				int input_K = scanner.nextInt();
				int input_N = scanner.nextInt();

				input_X -= input_Y;
				
				boolean flag = false;

				while(input_N-- > 0) {
					int input_P = scanner.nextInt();
					int input_C = scanner.nextInt();
					if (input_K >= input_C) {
						if(input_X <= input_P){
							flag = true;
						}
					}
				}
				System.out.println(flag ? "LuckyChef" : "UnluckyChef");
			}
		}
		System.err.println("Done in " + ((System.nanoTime() - beginTime) / 1e9) + " seconds.");
	}

}