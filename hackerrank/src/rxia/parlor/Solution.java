package rxia.parlor;

import java.util.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		long T = getLength();
		long M = getLength();
		long N = getLength();
		long[] array = getArray(N);
		long[] array1 = array;

		for (int k = 0; k < T; k++) {
			int i = 1, j = 1;
			for (long x : array) {
				for (long y : array1) {
					if (x + y == M) {
						System.out.println(x < y ? i + " " + j : j + " " + i);
					}
					j++;
				}
				i++;
			}
		}

	}

	private static long getLength() {
		return scanner.nextLong();
	}

	private static long[] getArray() {
		long length = getLength();
		long[] Q = new long[(int) length];
		for (int i = 0; i < Q.length; i++) {
			Q[i] = scanner.nextLong();
		}
		return Q;
	}

	private static long[] getArray(long length) {
		long[] Q = new long[(int) length];
		for (int i = 0; i < Q.length; i++) {
			Q[i] = scanner.nextLong();
		}
		return Q;
	}

}