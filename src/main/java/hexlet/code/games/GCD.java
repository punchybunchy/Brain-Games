package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    static final int A = 1;
    static final int B = 100;
    static final int ARR_SIZE = 100;

    private static String[] questions  = new String[ARR_SIZE];
    private static String[] answers = new String[ARR_SIZE];
    private static String description = "Find the greatest common divisor of given numbers.";

    public static void runGCD() {
        for (int index = 0; index < ARR_SIZE; index++) {
            int firstNumber = A + (int) (Math.random() * B);
            int secondNumber = A + (int) (Math.random() * B);
            questions[index] = Integer.toString(firstNumber) + " " + Integer.toString(secondNumber);

            while (firstNumber != 0 && secondNumber != 0) {
                if (firstNumber > secondNumber) {
                    firstNumber = firstNumber % secondNumber;
                } else {
                    secondNumber = secondNumber % firstNumber;
                }
            } int result = firstNumber + secondNumber;

            answers[index] = Integer.toString(result);
        }
        Engine.gameRun(description, questions, answers);
    }
}
