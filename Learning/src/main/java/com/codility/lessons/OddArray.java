package com.codility.lessons;
public class OddArray {
	public static void main(String[] args) {
		int[] A = new int[7];
		A[0] = 9;
		A[1] = 7;
		A[2] = 7;
		A[3] = 3;
		A[4] = 5;
		A[5] = 5;
		A[6] = 9;

		OddArray oa = new OddArray();
		System.out.println(oa.solution(A));
	}

	public int solution(int[] A) {
		int N = A.length;
		if (N % 2 == 0) {
			return -1;
		}
		int unpaired = 0;
		for (int number : A) {
			System.out.print(unpaired + ", ");
			unpaired = unpaired^number;
			System.out.println(number + " = " + unpaired);
		}
		return unpaired;
		
	}
}
