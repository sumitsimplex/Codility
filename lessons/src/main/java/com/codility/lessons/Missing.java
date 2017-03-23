package com.codility.lessons;
import java.util.Arrays;

public class Missing {
	public static void main(String[] args) {
		int[] A = new int[7];
		A[0] = 2;
		A[1] = 3;
		A[2] = 5;
		A[3] = 1;
		A[4] = 6;
		A[5] = 7;
		A[6] = 2;

		Missing oa = new Missing();
		// System.out.println(oa.solution(A));
		System.out.println(oa.solutionPermutaion(A));
	}

	public int solution(int[] A) {
		int N = A.length;
		if (N <= 0) {
			return 1;
		}

		int sumN = (N + 1) * (N + 2) / 2;
		// System.out.println(sumN);
		int sumA = 0;
		for (int a : A)
			sumA += a;
		// System.out.println(sumA);
		return sumN - sumA;

	}

	public int solutionPermutaion(int[] A) {
		int N = A.length;
		Arrays.sort(A);
		if (N == 0) {
			return 0;
		}
		// System.out.println(sumN);
		int sumA = A[0];
		for (int i = 1; i < N; i++) {
			if (A[i] != A[i - 1])
				sumA += A[i];
		}
		// System.out.println(sumA);
		return sumA;
	}

}
