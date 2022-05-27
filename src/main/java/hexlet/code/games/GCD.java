package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static void runGCD() {

        final int parameter1 = 1; //constant to define the minimum of a random number, can be modified
        final int parameter2 = 10; //constant to define the maximum of power of number, can be modified
        final int amountOfGameRounds = 3;
        final int questionAndAnswer = 2;
        final String description = "Find the greatest common divisor of given numbers.";

        String[][] tasks = new String[amountOfGameRounds][questionAndAnswer];

        for (int round = 0; round < amountOfGameRounds; round++) {
            int firstNumber = Utils.getRandomNumber(parameter1, parameter2);
            int secondNumber = Utils.getRandomNumber(parameter1, parameter2);

            String question = firstNumber + " " + secondNumber;
            String answer = getGCD(firstNumber, secondNumber);

            tasks[round][0] = question;
            tasks[round][1] = answer;
        }
        Engine.gameRun(description, tasks);
    }

    private static String getGCD(int firstNumber, int secondNumber) {

        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber % secondNumber;
            } else {
                secondNumber = secondNumber % firstNumber;
            }
        } int result = firstNumber + secondNumber;
        return Integer.toString(result);
    }
}
