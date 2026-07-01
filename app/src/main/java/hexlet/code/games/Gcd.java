package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {

    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;

    public static void runGame() {
        String description = "Find the greatest common divisor of given numbers.";
        Random random = new Random();
        String[][] roundsData = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int firstNumber = random.nextInt(MAX_NUMBER);
            int secondNumber = random.nextInt(MAX_NUMBER);

            String question = firstNumber + " " + secondNumber;
            int result = findGcd(firstNumber, secondNumber);
            String correctAnswer = String.valueOf(result);

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }
        Engine.runGame(description, roundsData);
    }

    private static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}

