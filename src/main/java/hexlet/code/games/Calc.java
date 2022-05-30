package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    static final String DESCRIPTION = "What is the result of the expression?";

    public static void runCalc() {
        final int parameter1 = 1; //constant to define the minimum of a random number, can be modified
        final int parameter2 = 10; //constant to define the maximum of power of number, can be modified
        final int parameter3 = 1; //constant to define  random number generator for "getOperator" method
        final int parameter4 = 3; //constant to define  random number generator for "getOperator" method

        String[][] tasks = new String[Engine.ROUNDS][Engine.QUESTION_AND_ANSWER];

        for (int round = 0; round < Engine.ROUNDS; round++) {

            int firstNumber = Utils.getRandomNumber(parameter1, parameter2);
            int secondNumber = Utils.getRandomNumber(parameter1, parameter2);
            int randomOperatorNumber = Utils.getRandomNumber(parameter3, parameter4);

            String question;
            String answer;

            question = firstNumber + getOperator(randomOperatorNumber) + secondNumber;
            answer = Integer.toString(getMathResult(firstNumber, secondNumber, randomOperatorNumber));

            tasks[round][0] = question;
            tasks[round][1] = answer;
        }
        Engine.gameRun(DESCRIPTION, tasks);
    }

    private static String getOperator(int randomNumber) {
        final int plus = 1;
        final int minus = 2;
        final int multiplication = 3;

        String randomOperator;

        randomOperator = switch (randomNumber) {
            case plus -> " + ";
            case minus -> " - ";
            case multiplication -> " * ";
            default -> "Unknown operator entered";
        };
        return randomOperator;
    }

    private static int getMathResult(int firstNumber, int secondNumber, int operatorNumber) {
        final int plus = 1;
        final int minus = 2;
        final int multiplication = 3;
        int mathResult;

        mathResult = switch (operatorNumber) {
            case plus -> firstNumber + secondNumber;
            case minus -> firstNumber - secondNumber;
            case multiplication -> firstNumber * secondNumber;
            default -> 0;
        };
        return mathResult;
    }


}
