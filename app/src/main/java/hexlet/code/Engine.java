package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void runGame(String description, String[][] roundsData) {
        Scanner scanner = new Scanner(System.in);
        String name = Cli.greetUser();

        System.out.println(description);

        for (int i = 0; i < roundsData.length; i++) {
            String question = roundsData[i][0];
            String correctAnswer = roundsData[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            String answer = scanner.nextLine();

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
}
