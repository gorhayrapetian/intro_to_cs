public class Problem3 {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(fibonacci(number));
    }
    public static int fibonacci(int number) {
        if (number <= 0) {
            return 0;
        } else if (number <= 2) {
            return number - 1;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}