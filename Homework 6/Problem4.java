public class Problem4 {
    public static void main(String[] args) {
        char[][] theaterSeats = {
            {'o', 'o', 'x', 'o', 'x', 'o', 'o', 'x'},
            {'o', 'x', 'o', 'x', 'x', 'o', 'o', 'o'},
            {'o', 'o', 'o', 'o', 'x', 'o', 'x', 'o'},
            {'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'}
        };

        int groupSize = 1;

        getSeats(theaterSeats, groupSize);
    }
    public static void getSeats(char[][] theaterSeats, int groupSize) {
        for (int i = 0; i < theaterSeats.length; i++) {
            for (int j = 0; j < theaterSeats[0].length - groupSize + 1; j++) {
                boolean found = true;
                for (int k = 0; k < groupSize; k++) {
                    if (theaterSeats[i][j + k] != 'o') {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    System.out.println("row " + (i + 1) + " seats from " + (j + 1) + " to " + (j + groupSize));
                }
            }
        }
    }
}