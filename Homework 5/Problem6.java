public class Problem6 {
    public static void main(String[] args) {

        int[][] matrix = { // escape the matrix : Top G
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] transpose = getTranspose(matrix);

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] getTranspose(int[][] matrix) {

        int[][] newArray = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newArray[j][i] = matrix[i][j];
            }
        }

        return newArray;
    }
}
