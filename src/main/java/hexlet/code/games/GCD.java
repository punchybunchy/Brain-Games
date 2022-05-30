package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void runGCD() {

        final int parameter1 = 1; //constant to define the minimum of a random number, can be modified
        final int parameter2 = 10; //constant to define the maximum of power of number, can be modified

        String[][] tasks = new String[Engine.ROUNDS][Engine.QUESTION_AND_ANSWER];

        for (int round = 0; round < Engine.ROUNDS; round++) {
            int firstNumber = Utils.getRandomNumber(parameter1, parameter2);
            int secondNumber = Utils.getRandomNumber(parameter1, parameter2);

            String question = firstNumber + " " + secondNumber;
            String answer = gcd(firstNumber, secondNumber);

            tasks[round][0] = question;
            tasks[round][1] = answer;
        }
        Engine.gameRun(DESCRIPTION, tasks);
    }

    private static String gcd(int firstNumber, int secondNumber) {

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
