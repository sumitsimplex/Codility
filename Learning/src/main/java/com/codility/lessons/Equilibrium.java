package com.codility.lessons;

import java.util.Arrays;

public class Equilibrium {

	public static void main(String[] args) {

		Equilibrium slTest = new Equilibrium();
		int[] A = new int[8];
		A[0] = -1;
		A[1] = 3;
		A[2] = -4;
		A[3] = 5;
		A[4] = 1;
		A[5] = -6;
		A[6] = 2;
		A[7] = 1;
		
		System.out.println(slTest.solution(A));

		int[] B = new int[5];
		B[0] = 3;
		B[1] = 1;
		B[2] = 2;
		B[3] = 4;
		B[4] = 3;
		
		System.out.println(slTest.solutionTape(B));

	}

	public int solution(int[] A) {
		int N = A.length;
		long sumleft = 0;
		long sumright = 0;
		long sumtotal = sum(A);
		// System.out.println(sumtotal);
		if (N == 0) {
			return -1;
		}

		if (sumtotal - A[0] == 0) {
			// System.out.println("found equilibrium @0");
			return 0;
		}
		if (sumtotal - A[N - 1] == 0) {
			// System.out.println("found equilibrium @N-1");
			return N - 1;
		}

		for (int i = 0; i < N; i++) {
			if (i != 0)
				sumleft += A[i - 1];
			sumright = sumtotal - A[i] - sumleft;
			if (sumleft == sumright) {
				// System.out.println("found equilibrium @" + (i));
				return i;
			}
		}

		return -1;

	}

	public int solutionTape(int[] A) {
		int N = A.length;
		int min = Integer.MAX_VALUE;
		if (N <= 0) {
			return -1;
		}
		int sumleft = 0;
		int sumright = 0;
		int sumtotal = (int) sum(A);
		for (int i = 0; i < N; i++) {
			if (i != 0)
				sumleft += A[i - 1];
			sumright = sumtotal - sumleft;
			int difference = (int) Math.abs(sumright - sumleft);
			min = difference < min ? difference : min;
		}
		return min;
	}

	public int solutionT2(int[] A) {
		if (A.length == 2)
			return Math.abs(A[0] - A[1]);

		int[] s1 = new int[A.length - 1];
		s1[0] = A[0];
		for (int i = 1; i < A.length - 1; i++) {
			s1[i] = s1[i - 1] + A[i];
		}

		int[] s2 = new int[A.length - 1];
		s2[A.length - 2] = A[A.length - 1];
		for (int i = A.length - 3; i >= 0; i--) {
			s2[i] = s2[i + 1] + A[i + 1];
		}

		int finalSum = Integer.MAX_VALUE;
		for (int j = 0; j < s1.length; j++) {
			int sum = Math.abs(s1[j] - s2[j]);
			if (sum < finalSum)
				finalSum = sum;
		}
		return finalSum;
	}

	public long sum(int[] subArray) {
		long sum = 0;
		for (int i = 0; i < subArray.length; i++) {
			sum += subArray[i];
		}
		return sum;
	}
}
