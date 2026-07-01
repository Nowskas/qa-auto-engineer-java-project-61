package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
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

        if (userChoice.equals("4")) {
            Gcd.runGame();
        }

        if (userChoice.equals("5")) {
            Progression.runGame();
        }

        if (userChoice.equals("6")) {
            Prime.runGame();
        }
    }
}
