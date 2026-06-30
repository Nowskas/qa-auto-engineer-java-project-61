package hexlet.code;

import java.util.Random;

public class Progression {

    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;
    private static final int PROGRESSION_LENGTH = 10;

    public static void runGame() {
        String description = "What number is missing in the progression?";
        Random random = new Random();
        String[][] roundsData = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int start = random.nextInt(MAX_NUMBER);
            int step = random.nextInt(5) + 1;
            int hiddenIndex = random.nextInt(PROGRESSION_LENGTH);

            int[] progression = new int[PROGRESSION_LENGTH];

            for (int j = 0; j < PROGRESSION_LENGTH; j++) {
                progression[j] = start + j * step;
            }

            String correctAnswer = String.valueOf(progression[hiddenIndex]);
            String question = "";

            for (int j = 0; j < PROGRESSION_LENGTH; j++) {
                if (j == hiddenIndex) {
                    question = question + "..";
                } else {
                    question = question + progression[j];
                }

                if (j < PROGRESSION_LENGTH - 1) {
                    question = question + " ";
                }
            }

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.runGame(description, roundsData);
    }
}
