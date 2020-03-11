package learn.manisha;

public class MatrixPrgm {
	public static boolean search(int[][] matrix, int search) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == search) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int array[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(search(array, 7));
	}
}
