import java.util.Date;

public class P06B {
    public static void main(String[] args) {
        long startTime;
        long endTime;

        int start = 2;
        int end = 10_000_000;

        //counting the primes using the number itself without printing
        startTime = new Date().getTime();
        for(int i=start; i<=end; i++){
            boolean isPrime = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                isPrime = true;
            }
        }
        endTime = new Date().getTime();
        System.out.println("Time using the number itself without printing: " + (endTime - startTime) + "ms");

        // counting the primes using Math.sqrt() without printing
        startTime = new Date().getTime();
        for(int i=start; i<=end; i++){
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                isPrime = true;
            }
        }
        endTime = new Date().getTime();
        System.out.println("Time using Math.sqrt() without printing: " + (endTime - startTime) + "ms");
    }
}