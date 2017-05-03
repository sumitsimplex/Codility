package com.codility.test;

public class Decimalzip {

	public int solution(int A, int B) {
		if (A < 0 || A > 100000000 || B < 0 || B > 100000000)
			return -1;

		String strA = Integer.toString(A);
		String strB = Integer.toString(B);
		String strC = "";

		for (int i = 0; i < strA.length() || i < strB.length(); i++) {
			if (i < strA.length()) {
				strC += strA.charAt(i);
			}
			if (i < strB.length()) {
				strC += strB.charAt(i);
			}
		}
		long C = Long.parseLong(strC);
		return C > 100000000 ? -1: (int) C;
	}

}
