//Multiply Two Matrices
public class MatrixMultiplication{
  //Assumes the matrices are the same legnth (this is when the dot product is defined)
  public static int dot(int[] a1, int[] a2){
    int res = 0;
    for(int i = 0; i < a1.length; i++){
      res += a1[i]*a2[i];
    }
    return res;
  }

  //Assumes consistent size vertically (this is always true in 2D array in java)
  private static int[] column(int[][] array, int column){
    int[] res = new int[array.length];
    for(int i = 0; i < array.length; i++){
      res[i] = array[i][column];
    }
    return res;
  }

  //Assumes rectangular matrices with inner dimensions equal (When matrix multiplication is defined)
  public static int[][] matrixMult(int[][] left, int[][] right){
    int[][] res = new int[left.length][right[0].length];
    for(int i = 0; i<left.length; i++){
      for(int j = 0; j<right[0].length; j++){
        res[i][j] = dot(left[i], column(right, j));
      }
    }
    return res;
  }

	private static void printArray(int[][] data){
		for(int i = 0; i < data.length; i++){
			for(int j = 0; j < data[i].length; j++){
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}

  public static void main(String[] args){
    int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
    int[][] matrix2 = {{1, 2}, {3, 4}, {5, 6}};
    printArray(matrixMult(matrix1, matrix2));
  }
}
