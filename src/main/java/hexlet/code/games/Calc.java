package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    static final String DESCRIPTION = "What is the result of the expression?";
    static final char[] OPERATORS = {'+', '-', '*'};

    public static void runCalc() {
        final int parameter1 = 1; //constant to define the minimum of a random number, can be modified
        final int parameter2 = 10; //constant to define the maximum of power of number, can be modified

        String[][] tasks = new String[Engine.ROUNDS][Engine.QUESTION_AND_ANSWER];

        for (int round = 0; round < Engine.ROUNDS; round++) {

            int firstNumber = Utils.getRandomNumber(parameter1, parameter2);
            int secondNumber = Utils.getRandomNumber(parameter1, parameter2);
            int randomOperatorIndex = Utils.getRandomNumber(parameter1, OPERATORS.length) - 1;
            char operator = OPERATORS[randomOperatorIndex];

            String question = firstNumber + " " + operator + " " + secondNumber;
            String answer = Integer.toString(calculateAnswer(firstNumber, secondNumber, operator));

            tasks[round][0] = question;
            tasks[round][1] = answer;
        }
        Engine.gameRun(DESCRIPTION, tasks);
    }

    private static int calculateAnswer(int firstNumber, int secondNumber, char operator) {

        int calculatedAnswer;

        switch (operator) {
            case '+':
                calculatedAnswer = firstNumber + secondNumber;
                break;
            case '-':
                calculatedAnswer = firstNumber - secondNumber;
                break;
            case '*':
                calculatedAnswer = firstNumber * secondNumber;
                break;
            default:
                throw new RuntimeException("Unknown operator entered: " + operator);
        }
        return calculatedAnswer;
    }
}
