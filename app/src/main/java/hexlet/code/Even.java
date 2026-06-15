package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;

    public static void runGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String name = Cli.greetUser();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = random.nextInt(MAX_NUMBER);

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");

            String answer = scanner.nextLine();

            boolean isEvenNumber = isEven(number);

            String correctAnswer;

            if (isEvenNumber) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }


        System.out.println("Congratulations, " + name + "!");
    }

    private static boolean isEven(int number) {
        return (number % 2) == 0;
    }
}
