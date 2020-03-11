package learn.manisha;

public class Matrix12 {

	public static boolean search(int[][] matrix12, int searchelement) {
		int i=0, j=matrix12.length-1;
		while (i < matrix12.length && j >= 0) {
			if (searchelement == matrix12[i][j]) {
				return true;
			} else if (searchelement < matrix12[i][j]) {
				j--;
			} else {
				i++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int array[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(search(array, 9));
	}
}
