public class Problem3 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        printArray(shift(array, -2, true));
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void shiftByOneInDirection(int[] array, String direction) {
        if (direction == "left") {

            int temp = array[0];

            for (int i = 1; i < array.length; i++) {
                array[i-1] = array[i];
            }

            array[array.length - 1] = temp;

        } else {
            int temp = array[array.length - 1];

            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }

            array[0] = temp;

        }
    }

    public static void shift(int[] array) {
        shiftByOneInDirection(array, "right");
    }

    public static void shift(int[] array, int shiftSize) {

        if (shiftSize > 0) {
            for (int i = 0; i < shiftSize; i++) {
                shiftByOneInDirection(array, "right");
            }
        } else {
            for (int i = shiftSize; i < 0 ; i++) {
                shiftByOneInDirection(array, "left");
            }
        }

    }

    public static int[] shift(int[] array, int shiftSize, boolean createNewArray) {

        if (createNewArray) {
            int[] newArray = array.clone();
            shift(newArray, shiftSize);
            return newArray;
        } else {
            shift(array, shiftSize);
            return array;
        }

    }
}