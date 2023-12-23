public class Problem5 {
    public static void main(String[] args) {
        String binaryNumber = "0000000000000000000000000001100";
        int decimal = parseBinaryInt(binaryNumber);
        System.out.println("Decimal: " + decimal);
    }
    public static int parseBinaryInt(String binary) {
        if (binary.length() != 8 && binary.length() != 16 && binary.length() != 32 && binary.length() != 64) {
            System.exit(0);
        }

        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            char digit = binary.charAt(i);
            int power = length - i - 1;

            if (digit == '1') {
                decimal += (int) Math.pow(2, power);
            }
        }

        return decimal;
    }
}