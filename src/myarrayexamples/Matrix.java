package myarrayexamples;

public class Matrix {
	public static void main(String[] args) {
		int rows = 2, columns = 4;
		int[][] matrix1 = {{1,1,1,1},{2,3,5,2}};
		int[][] matrix2 = {{2,3,4,5},{2,2,4,-4}};
		int[][] sum = new int[rows][columns];
		for(int i =0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println("Sum of given matrices is : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
}
