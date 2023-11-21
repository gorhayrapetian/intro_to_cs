public class Problem5 {
    public static void main(String[] args) {

        int[][] matrix = { // esacape the matrix : Top G
            {1, 2},
            {1, 11},
            {5, 6},
            {3, 4, 2}
        };

        System.out.println(getMax(matrix));

    }
    public static int getMax(int[][] array) {

        int max = 0;
        int indexOfMax = 0;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
            if (sum > max) {
                max = sum;
                indexOfMax = i;
            }
        }

        return indexOfMax;
    }
}
