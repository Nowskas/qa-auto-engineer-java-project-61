package hexlet.code;

import java.util.Random;

public class Even {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;

    public static void runGame() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        Random random = new Random();
        String[][] roundsData = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = random.nextInt(MAX_NUMBER);

            String question = String.valueOf(number);

            String correctAnswer;

            if (isEven(number)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.runGame(description, roundsData);
    }

    private static boolean isEven(int number) {
        return (number % 2) == 0;
    }
}

