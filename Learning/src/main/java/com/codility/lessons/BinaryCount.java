package com.codility.lessons;

class BinaryCount {

	public static void main(String[] args) {
		BinaryCount bn = new BinaryCount();
		System.out.println(bn.solution(529));
	}

	public int solution1(int N) {
		String bN = Integer.toBinaryString(N);
		System.out.println(bN);
		int len = 0;
		for (int i = 0; i < bN.length(); i++) {
			if (bN.charAt(i) == '0') {
				System.out.println("yes");
			}
		}
		return len;
	}

	public int solution(int N) {
		int max = 0;
		int count = -1;
		int r = 0;

		while (N > 0) {
			r = N & 1;
			N = N >> 1;

			if (r == 0 && count >= 0) {
				count++;
			}

			if (r == 1) {
				max = count > max ? count : max;
				count = 0;
			}
		}

		return max;
	}
}