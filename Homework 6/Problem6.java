import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        String inputText = takeInput();
        String[] words = inputText.split("[\\s.,?!{}_+=&*^$%@#^()]+");
        countAndPrintWords(words);
    }
    public static String takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine().toLowerCase();
        return text;
    }
    public static void countAndPrintWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                int count = 1;
                for (int j = i + 1; j < words.length; j++) {
                    if (words[j].equals(words[i])) {
                        count++;
                        words[j] = "";
                    }
                }
                System.out.println(words[i] + " " + count);
            }
        }
    }
}