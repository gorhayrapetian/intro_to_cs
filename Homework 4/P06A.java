import java.util.Date;

public class P06A {
    public static void main(String[] args) {
        long startTime;
        long endTime;

        int start = 2;
        int end = 10_000_000;

        // printing numbers using the number itself
        startTime = new Date().getTime();
        for(int i=start; i<=end; i++){
            boolean isPrime = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
        endTime = new Date().getTime();
        System.out.println("Time printing numbers using the number itself: " + (endTime - startTime) + "ms");

        // printing the numbers using Math.sqrt()
        startTime = new Date().getTime();
        for(int i=start; i<=end; i++){
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
        endTime = new Date().getTime();
        System.out.println("Time printing the numbers using Math.sqrt(): " + (endTime - startTime) + "ms");
    }
}