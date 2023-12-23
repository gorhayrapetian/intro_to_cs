import java.util.Random;

public class Problem1 {
    public static void main(String[] args) {

        System.out.println(test(5, 4));

        Random random = new Random();

        // for (int i = 0; i < 3; i++) {
        //     int year = random.nextInt(1900, 1999);

        //     if (isLeap(year)) {
        //         System.out.println(year + " is leap");
        //     } else {
        //         System.out.println(year + " is not leap");
        //     }
        // }
    }

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public static int test(int a, int b) {
            if (a < b) {
                return 0;
            } else {
                return 1 + test(a - b, b);
            }
    }
}