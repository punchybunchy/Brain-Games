package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    static final int a = 1;
    static final int b = 100;

    static String[] questions  = new String[100];
    static String[] answers = new String[100];
    static String description = "What is the result of the expression?";

    public static void runCalc() {
        for (int index = 0; index < 100; index++){

            int firstNumber = a + (int) (Math.random() * b);
            String firstStrNumber = Integer.toString(firstNumber);

            int secondNumber = a + (int) (Math.random() * b);
            String secondStrNumber = Integer.toString(secondNumber);

            int mathResult = 0;
            String expression = " ";

            var x = a + (int) (Math.random() * b);

            if (x <= 33) {
                mathResult = firstNumber + secondNumber;
                expression = firstStrNumber + " + " + secondStrNumber;
            } else if (x > 33 && x <= 66) {
                mathResult = firstNumber - secondNumber;
                expression = firstStrNumber + " - " + secondStrNumber;
            } else if (x > 66) {
                mathResult = firstNumber * secondNumber;
                expression = firstStrNumber + " * " + secondStrNumber;
            }
            questions[index] = expression;
            answers[index] = Integer.toString(mathResult);
        }
        Engine.gameRun(description, questions, answers);
    }
}
