public class Problem7 {
    public static void main(String[] args) {
        int number = 5;
        int[][] matrix = createMatrix(number);

        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] createMatrix(int number) {
        int[][] matrix = new int[number][number];
        int square = number * number;
        int startRow = 0;
        int endRow = number - 1;
        int startCol = 0;
        int endCol = number - 1;

        while (startRow <= endRow && startCol <= endCol) {

            for (int i = startRow; i <= endRow; i++) {
                matrix[i][startCol] = square--;
            }
            startCol++;

            // right
            for (int i = startCol; i <= endCol; i++) {
                matrix[endRow][i] = square--;
            }
            endRow--;

            // up
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    matrix[i][endCol] = square--;
                }
                endCol--;
            }

            // left
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    matrix[startRow][i] = square--;
                }
                startRow++;
            }
        }

        return matrix;
    }
}
