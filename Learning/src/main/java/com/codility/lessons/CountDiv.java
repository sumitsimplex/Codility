package com.codility.lessons;

public class CountDiv {

	public static void main(String[] args) {
		CountDiv cv = new CountDiv();
		System.out.println(cv.solution(6, 11, 2));
	}

	public int solution(int A, int B, int K) {
//		int b = B/K;
//	    int a = (A > 0 ? (A - 1)/K: 0);
//	    if (B<A || K==0 || K>B )
//            return 0;
//	    if(A == 0){
//	        b++;
//	    }
//	    return b - a;
	    
	    int offsetForLeftRange = 0;
	    if ( A % K == 0) { offsetForLeftRange++; }

	    return  (B/K) - (A /K) + offsetForLeftRange;
//		int count = 0;
//		for (int i = A; i <= B; i++) {
//			if (i % K == 0) {
//				count++;
//			}
//		}
//		return count;
	}
}
