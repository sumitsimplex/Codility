package com.codility.test;

public class Countries {

	public static void main(String[] args) {
		Countries ct = new Countries();
		int[][] A = { { 5, 4, 4 }, { 4, 3, 4 }, { 3, 2, 4 }, { 2, 2, 2 }, { 3, 3, 4 }, { 1, 4, 4 }, { 4, 1, 1 } };
		System.out.println("\n\ncountries: " + ct.solution(A));
	}

	boolean isSame(int value, int M[][], int row, int col, boolean visited[][]) {
		// row number is in range, column number is in range and value is same as country visted before
		int ROW = M.length;
		int COL = M[0].length;
		return (row >= 0) && (row < ROW) && (col >= 0) && (col < COL) && (M[row][col] == value && !visited[row][col]);
	}

	// A utility function to do DFS for a 2D boolean matrix.
	// It only considers the orthogonal 4 neighbors
	void DFS(int M[][], int row, int col, boolean visited[][]) {
		// These arrays are used to get row and column numbers north, south, east, west
		int rowNbr[] = new int[] { -1, 1, 0, 0 };
		int colNbr[] = new int[] { 0, 0, 1, -1 };

		// Mark this cell as visited
		visited[row][col] = true;

		// Recur for all connected parts of same county
		for (int k = 0; k < 4; ++k)
			if (isSame(M[row][col], M, row + rowNbr[k], col + colNbr[k], visited))
				DFS(M, row + rowNbr[k], col + colNbr[k], visited);
	}

	// The main function that returns count of islands in a given
	// boolean 2D matrix
	public int solution(int M[][]) {
		// Make a bool array to mark visited cells.
		// Initially all cells are unvisited
		int ROW = M.length;
		int COL = M[0].length;
		boolean visited[][] = new boolean[ROW][COL];

		// Initialize count as 0 and travese through the all cells
		// of given matrix
		int count = 0;
		for (int i = 0; i < ROW; ++i)
			for (int j = 0; j < COL; ++j)
				if (!visited[i][j]) // If a cell with
				{ // Visit all
					DFS(M, i, j, visited);
					++count;
				}

		return count;
	}
}
