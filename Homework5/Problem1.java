import java.util.Random;

public class Problem1 {
    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int year = random.nextInt(1900, 1999);

            if (isLeap(year)) {
                System.out.println(year + " is leap");
            } else {
                System.out.println(year + " is not leap");
            }
        }
    }

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}
