package com.codility.lessons;

public class FrogJump {

	public static void main(String[] args) {
		FrogJump fj = new FrogJump();
		System.out.println(fj.solution(10, 100, 30));
	}

	public int solution(int X, int Y, int D) {
		if (X > Y) {
			return 0;
		}
		if (D > (Y-X)) {
			return 1;
		} else {
			// int curr_pos = X;
			// int count = 0;
			// while (curr_pos < Y) {
			// curr_pos += D;
			// count ++;
			// }
			// return count;
			if ((Y - X) % D == 0)
				return (Y - X) / D;
			else
				return (Y - X) / D + 1;

		}
	}

}
