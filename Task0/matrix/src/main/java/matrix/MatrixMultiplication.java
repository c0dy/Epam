package matrix;

/**
 * Created by c0dyy on 1/25/17.
 *
 * The matrix must satisfy the following condition: matrixA = [n,m]
 *                                                  matrixB = [m,k]
 *                                  where the result will be: [n,k]
 */
public class MatrixMultiplication {
    public static void main(String[] args) {

       private int n = 3; // The number of rows of the first matrix (matrixA)
       private int m = 3; // The number of cols of the first matrix == the number of rows of the second matrix (matrixB) AND >= n
       private int k = 3; // The number of cols of the second matrix (matrixB)

       private int[][] matrixA = new int[n][];
       private int[][] matrixB = new int[m][];
       private int[][] result  = new int[n][];

        for(int i = 0; i < result.length; i++) result[i] = new int[k];

        System.out.println("Matrix A: ");
        for(int i = 0; i < matrixA.length; i++) {
            matrixA[i] = new int[m];
            for(int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = (int)Math.round(Math.random()*10);
                System.out.print(matrixA[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("Matrix B: ");
        for(int i = 0; i < matrixB.length; i++) {
            matrixB[i] = new int[k];
            for(int j = 0; j < matrixB[i].length; j++) {
                matrixB[i][j] = (int)Math.round(Math.random()*10);
                System.out.print(matrixB[i][j] + "  ");
            }
            System.out.println();
        }

        for(int i = 0; i < matrixA.length; i++) {
            for(int j = 0; j < matrixB[i].length; j++) {
                for(int l = 0; l < matrixB.length; l++) {
                    result[i][j] += matrixA[i][l] * matrixB[l][j];
                }
            }
        }

        System.out.println("RESULT: ");
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
