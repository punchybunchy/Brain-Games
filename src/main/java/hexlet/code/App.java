package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                0 - Exit""");

        Scanner selectGame = new Scanner(System.in);
        int gameId = selectGame.nextInt();
        String gameChose = Integer.toString(gameId);

        switch (gameChose) {
            case "1" -> Greet.inputName();
            case "2" -> Even.runEven();
            case "3" -> Calc.runCalc();
            case "4" -> GCD.runGCD();
            case "5" -> Progression.runProgression();
            default -> {
            }
        }
    }
}
