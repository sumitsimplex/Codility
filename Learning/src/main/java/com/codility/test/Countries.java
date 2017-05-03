package com.codility.test;

public class Countries {

	public static void main(String[] args) {
		Countries ct = new Countries();
		int[][] A = { { 5, 4, 4 }, { 4, 3, 4 }, { 3, 2, 4 }, { 2, 2, 2 }, { 3, 3, 4 }, { 1, 4, 4 }, { 4, 1, 1 } };
		System.out.println("\n\ncountries: " + ct.solution(A));
	}

	boolean isSame(int value, int M[][], int row, int col, boolean visited[][]) {
		int ROW = M.length;
		int COL = M[0].length;
		return (row >= 0) && (row < ROW) && (col >= 0) && (col < COL) && (M[row][col] == value && !visited[row][col]);
	}

	// It only considers the orthogonal 4 neighbors
	void DFS(int M[][], int row, int col, boolean visited[][]) {
		// These arrays are used to get row and column numbers north, south, east, west
		int rowNbr[] = new int[] { -1, 1, 0, 0 };
		int colNbr[] = new int[] { 0, 0, 1, -1 };

		visited[row][col] = true;

		for (int k = 0; k < 4; ++k)
			if (isSame(M[row][col], M, row + rowNbr[k], col + colNbr[k], visited))
				DFS(M, row + rowNbr[k], col + colNbr[k], visited);
	}

	public int solution(int M[][]) {
		int ROW = M.length;
		int COL = M[0].length;
		boolean visited[][] = new boolean[ROW][COL];
		int count = 0;
		for (int i = 0; i < ROW; ++i)
			for (int j = 0; j < COL; ++j)
				if (!visited[i][j])
				{
					DFS(M, i, j, visited);
					++count;
				}
		return count;
	}
}
