package hexlet.code;

import java.util.Random;

public class Prime {

    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;

    public static void runGame() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'";
        Random random = new Random();
        String[][] roundsData = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < ROUNDS_COUNT; i++) {

            int number = random.nextInt(MAX_NUMBER);

            boolean result = isPrime(number);

            String question = String.valueOf(number);

            String correctAnswer;

            if (result) {

                correctAnswer = "yes";

            } else {

                correctAnswer = "no";

            }

            roundsData[i][0] = question;

            roundsData[i][1] = correctAnswer;        }

        Engine.runGame(description, roundsData);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}



