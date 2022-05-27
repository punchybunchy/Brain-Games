package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int exit = 0;
        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");

        Scanner selectGame = new Scanner(System.in);
        int gameId = selectGame.nextInt();

        switch (gameId) {
            case greet -> {
                System.out.println("Your choice: " + gameId);
                System.out.println("\n" + "Welcome to the Brain Games!");
                Cli.inputName();
            }
            case even -> {
                System.out.println("Your choice: " + gameId);
                System.out.println("\n" + "Welcome to the Brain Games!");
                Even.runEven();
            }
            case calc -> {
                System.out.println("Your choice: " + gameId);
                System.out.println("\n" + "Welcome to the Brain Games!");
                Calc.runCalc();
            }
            case gcd -> {
                System.out.println("Your choice: " + gameId);
                System.out.println("\n" + "Welcome to the Brain Games!");
                GCD.runGCD();
            }
            case progression -> {
                System.out.println("Your choice: " + gameId);
                System.out.println("\n" + "Welcome to the Brain Games!");
                Progression.runProgression();
            }
            case prime -> {
                System.out.println("Your choice: " + gameId);
                System.out.println("\n" + "Welcome to the Brain Games!");
                Prime.runPrime();
            }
            case exit -> {
                System.out.println("Your choice: " + gameId);
                System.out.println("\n" + "Exit");
            }
            default -> System.out.println("Please retry and make sure the correct number is selected");

        }
        selectGame.close();
    }
}
