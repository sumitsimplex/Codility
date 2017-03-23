package com.codility.lessons;

public class CyclicRotation {

	public static void main(String[] args) {
		CyclicRotation cr = new CyclicRotation();
		int[] A = { 3, 8, 9, 7, 6 };
		//   {3, 8, 9, 7, 6}
		//    0  1  2  3  4
		// 5 {9, 7, 6, 3, 8}
		//    2  3  4  0  1
		//    
		int K = 3;
		for (int x : cr.solution(A, K))
			System.out.print(x + ", ");
	}

	public int[] solution(int[] A, int K) {
		int N = A.length;
		int[] X = new int[N];
        if (N==0)
            return A;
        if (K==0)
            return A;
        
        if (K>=N)
            K %= N;
        
		for(int i=0; i<N; i++){
			X[i] = (i<K) ? A[N+i-K] : A[i-K];
//			if (i<K)
//				X[i] = A[N-K+i];
//			else
//				X[i] = A[i-K];
		}
		return X;
	}
}
