package hexlet.code;

import java.util.Random;

public class Calc {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;

    public static void runGame() {
        String description = "What is the result of the expression?";

        Random random = new Random();
        String[][] roundsData = new String[ROUNDS_COUNT][2];

        String[] operations = {"+", "-", "*"};

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int firstNumber = random.nextInt(MAX_NUMBER);
            int secondNumber = random.nextInt(MAX_NUMBER);

            String operation = operations[random.nextInt(operations.length)];
            String question = firstNumber + " " + operation + " " + secondNumber;

            int result;

            switch (operation) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                default:
                    throw new RuntimeException("Unknown operation: " + operation);
            }

            String correctAnswer = String.valueOf(result);

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.runGame(description, roundsData);
    }
}
