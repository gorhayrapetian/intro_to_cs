public class P05 {

    public static void main(String[] args) {
        int number = 0;
        int[] primeFactors = getPrimeFactors(number);

        for (int i = 0; i < primeFactors.length; i++) {
            System.out.print(primeFactors[i] + " ");
        }
    }

    public static int[] getPrimeFactors(int number) {
        int[] primeFactors = new int[0];

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                primeFactors = appendToArray(primeFactors, i);
                number = number / i;
            }
        }

        return primeFactors;
    }

    public static int[] appendToArray(int[] array, int element) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[array.length] = element;

        return newArray;
    }
}