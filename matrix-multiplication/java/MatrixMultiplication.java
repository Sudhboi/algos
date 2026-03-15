//Multiply Two Matrices
public class MatrixMultiplication{
  //Assumes the matrices are the same legnth (this is when the dot product is defined)
  public static double dot(double[] a1, double[] a2){
    double res = 0;
    for(int i = 0; i < a1.length; i++){
      res += a1[i]*a2[i];
    }
    return res;
  }

  //Assumes consistent size vertically (this is always true in 2D array in java)
  private static double[] column(double[][] array, int column){
    double[] res = new double[array.length];
    for(int i = 0; i < array.length; i++){
      res[i] = array[i][column];
    }
    return res;
  }

  //Assumes rectangular matrices with inner dimensions equal (When matrix multiplication is defined)
  public static double[][] matrixMult(double[][] left, double[][] right){
    double[][] res = new double[left.length][right[0].length];
    for(int i = 0; i<left.length; i++){
      for(int j = 0; j<right[0].length; j++){
        res[i][j] = dot(left[i], column(right, j));
      }
    }
    return res;
  }

	private static void printArray(double[][] data){
		for(int i = 0; i < data.length; i++){
			for(int j = 0; j < data[i].length; j++){
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}

  public static void main(String[] args){
    double[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
    double[][] matrix2 = {{1, 2}, {3, 4}, {5, 6}};
    printArray(matrixMult(matrix1, matrix2));
  }
}
