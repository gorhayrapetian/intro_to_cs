public class Main {
    public static void main(String[] args) {
        int number = 10;
        int sum = getSumOfDigits(number);
        System.out.println(sum);
    }
    public static int getSumOfDigits(int number) {
        if (number < 10) {
            return  number;
        } else {
            return number % 10 + getSumOfDigits(number / 10);
        }
    }
}