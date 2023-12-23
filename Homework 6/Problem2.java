public class Problem2 {
    public static void main(String[] args) {
        String string = "ABCD";
        int length = 10;

        String recursiveString = getRecursiveString(string, length);
        String iterativeString = getIterativeString(string, length);

        System.out.println("Recursive: " + recursiveString);
        System.out.println("Iterative: " + iterativeString);
    }
    public static String getRecursiveString(String string, int length) {
        if (length == 0) {
            return "";
        } else {
            int randomIndex = (int) (Math.random() * string.length());
            char charRandom = string.charAt(randomIndex);
            String randomString = getRecursiveString(string, length - 1);
            return charRandom + randomString;
        }
    }
    public static String getIterativeString(String string, int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * string.length());
            char charRandom = string.charAt(randomIndex);
            result += charRandom;
        }
        return result;
    }
}