package com.codility.test;
import java.util.HashMap;
import java.util.Map;

public class Countries {
	

	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	public int solution(int[][] A) {
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				if ((i == 0 || A[i - 1][j] - A[i][j] != 0) && (j == 0 || A[i][j - 1] - A[i][j] != 0))
					result++;
			}
		}
		return result;
	}
}
