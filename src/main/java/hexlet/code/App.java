package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit""");

        Scanner selectGame = new Scanner(System.in);
        int gameId = selectGame.nextInt();

        switch (gameId) {
            case 1 -> Greet.inputName();
            case 2 -> Even.runEven();
            case 3 -> Calc.runCalc();
            default -> {
            }
        }
    }
}
