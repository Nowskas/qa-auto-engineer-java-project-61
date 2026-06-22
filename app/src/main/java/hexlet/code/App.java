package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();

        if (userChoice.equals("1")) {
            Cli.greetUser();
        }

        if (userChoice.equals("2")) {
            Even.runGame();
        }

        if (userChoice.equals("3")) {
            Calc.runGame();
        }
    }
}
