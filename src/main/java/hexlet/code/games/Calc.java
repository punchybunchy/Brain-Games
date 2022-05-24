package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    static final int A = 1;
    static final int B = 10;
    static final int C = 100;
    static final int ARR_SIZE = 100;

    private static String[] questions  = new String[ARR_SIZE];
    private static String[] answers = new String[ARR_SIZE];
    private static String description = "What is the result of the expression?";

    public static void runCalc() {
        for (int index = 0; index < ARR_SIZE; index++) {

            int firstNumber = A + (int) (Math.random() * B);
            String firstStrNumber = Integer.toString(firstNumber);

            int secondNumber = A + (int) (Math.random() * B);
            String secondStrNumber = Integer.toString(secondNumber);

            int mathResult = 0;
            String expression = " ";
            final int limitValue1 = 33; // this var needs to chose operator (+/-/*) in a random manner
            final int limitValue2 = 66;

            var x = A + (int) (Math.random() * C);

            if (x <= limitValue1) {
                mathResult = firstNumber + secondNumber;
                expression = firstStrNumber + " + " + secondStrNumber;
            } else if (x > limitValue1 && x <= limitValue2) {
                mathResult = firstNumber - secondNumber;
                expression = firstStrNumber + " - " + secondStrNumber;
            } else if (x > limitValue2) {
                mathResult = firstNumber * secondNumber;
                expression = firstStrNumber + " * " + secondStrNumber;
            }
            questions[index] = expression;
            answers[index] = Integer.toString(mathResult);
        }
        Engine.gameRun(description, questions, answers);
    }
}
