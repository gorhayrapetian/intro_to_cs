public class Problem2 {
    public static void main(String[] args) {

        int number = -1234;

        System.out.println(getReversed(number));

    }

    public static int getReversed(int number) {

        int reverse = 0;

        boolean isNegative = false;

        if (number * -1 > 0) {
            isNegative = true;
            number = number * -1;
        }

        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }

        if (isNegative) {
            reverse = reverse * -1;
        }

        return reverse;

    }
}