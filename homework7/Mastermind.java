import java.util.Random;
import java.util.Scanner;

public class Mastermind {
    private static final int CODE_LENGTH = 4;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            int guessCount = 12;
            playMastermind(guessCount);

            System.out.print("Do you want to play again? (Y/N): ");
            char playAgain = scanner.next().charAt(0);

            if (playAgain != 'Y' && playAgain != 'y') {
                System.out.println("Thank you for playing!");
                break;
            }
        } while (true);
    }

    public static void playMastermind(int guessCount) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] secretCode = generateSecretCode(random);

        System.out.println("Welcome to Mastermind!");
        System.out.println("Try to guess the " + CODE_LENGTH + "-digit code with digits from 1 to 6.");
        System.out.println("Feedback: 9 for correct digit and position, 8 for correct digit but wrong position.");

        while (guessCount > 0) {
            System.out.println("Guesses left: " + guessCount);
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine();

            if (isValidGuess(guess)) {
                int[] feedback = provideFeedback(secretCode, guess);
                printFeedback(feedback);

                if (allEqual(feedback, 9)) {
                    System.out.println("Congratulations! You guessed the secret code");
                    return;
                }
            } else {
                System.out.println("Invalid guess. Please enter a " + CODE_LENGTH + "-digit code with digits from 1 to 6.");
            }

            guessCount--;
        }

        System.out.println("You ran out of guesses. The secret code was: " + arrayToString(secretCode));
        System.out.println("Game over!");
    }

    public static int[] generateSecretCode(Random random) {
        int[] secretCode = new int[CODE_LENGTH];
        for (int i = 0; i < CODE_LENGTH; i++) {
            secretCode[i] = random.nextInt(6) + 1;
        }
        return secretCode;
    }

    public static void printFeedback(int[] feedback) {
        System.out.print("Feedback: [");
        for (int i = 0; i < CODE_LENGTH; i++) {
            System.out.print(feedback[i]);
            if (i < CODE_LENGTH - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] provideFeedback(int[] secretCode, String guess) {
        int[] feedback = new int[CODE_LENGTH];
        for (int i = 0; i < CODE_LENGTH; i++) {
            int guessDigit = guess.charAt(i) - '0';

            if (guessDigit == secretCode[i]) {
                feedback[i] = 9;
            } else if (contains(secretCode, guessDigit)) {
                feedback[i] = 8;
            }
        }
        return feedback;
    }

    public static boolean isValidGuess(String guess) {
        if (guess.length() != CODE_LENGTH) {
            return false;
        }

        for (int i = 0; i < CODE_LENGTH; i++) {
            char digit = guess.charAt(i);
            if (digit < '1' || digit > '6') {
                return false;
            }
        }
        return true;
    }

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static boolean allEqual(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != value) {
                return false;
            }
        }
        return true;
    }

    public static String arrayToString(int[] array) {
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            result += (char) (array[i] + '0');
            if (i < array.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}