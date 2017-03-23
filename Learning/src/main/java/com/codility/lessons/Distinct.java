package com.codility.lessons;
import java.util.Arrays;

public class Distinct {

	public int solution(int[] A) {
		Arrays.sort(A);
		int count = 0;
		int N = A.length;
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;
		for (int i = 1; i < A.length; i++) {
			if (A[i] != A[i - 1])
				count++;
		}
		return count;
	}
}
