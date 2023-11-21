public class P07 {
    public static void main(String[] args) {
        int t = 0;
        double sum = 0;
        while (t>=0) {
            double formula = Math.pow(-1, t) / (2 * t + 1);
            sum += formula;
            double numPI = 4*sum;
            double difference = numPI - Math.PI;
            if (difference <= 0.001 && difference >= -0.001) {
                System.out.println("# of terms: " + t);
                break;
            }
            t++;
        }
    }
}
