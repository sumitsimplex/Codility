package com.codility.test;

import java.util.HashMap;
import java.util.Map;

public class MaxDistance {

	public static void main(String[] args) {
		MaxDistance md = new MaxDistance();
		int[] A = new int[2000001];
		
		System.out.println(md.solution(A));
	}

	int solution(int[] A) {
		int N = A.length;
		System.out.println(N);
		// if(N>100000)
		// return -1;
		int result = 0;
		Map<Integer, Integer> distanceMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int element = A[i];
			if (distanceMap.containsKey(element)) {
				int pos = i - distanceMap.get(element);
				result = pos > result ? pos : result;
			} else {
				distanceMap.put(element, i);
			}
		}

//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				if (A[i] == A[j])
//					result = Math.max(result, Math.abs(i - j));
//			}
//		}
		return result;
	}
}
