package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static void runCalc() {
        final int parameter1 = 1; //constant to define the minimum of a random number, can be modified
        final int parameter2 = 10; //constant to define the maximum of power of number, can be modified
        final int parameter3 = 1; //constant to define  random number generator for "getOperator" method
        final int parameter4 = 3; //constant to define  random number generator for "getOperator" method
        final int amountOfGameRounds = 3;
        final int questionAndAnswer = 2;
        final String description = "What is the result of the expression?";

        String[][] tasks = new String[amountOfGameRounds][questionAndAnswer];

        for (int round = 0; round < amountOfGameRounds; round++) {

            int firstNumber = Utils.getRandomNumber(parameter1, parameter2);
            int secondNumber = Utils.getRandomNumber(parameter1, parameter2);
            int randomOperatorNumber = Utils.getRandomNumber(parameter3, parameter4);
            String question;
            String answer;

//            String question = firstNumber + getOperator(randomOperatorNumber) + secondNumber;
//            String answer = Integer.toString(getMathResult(firstNumber, secondNumber, randomOperatorNumber));

            if (randomOperatorNumber == 1) {
                question = firstNumber + " + " + secondNumber;
                var result = firstNumber + secondNumber;
                answer = Integer.toString(result);
            } else if (randomOperatorNumber == 2) {
                question = firstNumber + " - " + secondNumber;
                var result = firstNumber - secondNumber;
                answer = Integer.toString(result);
            } else {
                question = firstNumber + " * " + secondNumber;
                var result = firstNumber * secondNumber;
                answer = Integer.toString(result);
            }

            tasks[round][0] = question;
            tasks[round][1] = answer;
        }
        Engine.gameRun(description, tasks);
    }

//    private static String getOperator(int randomNumber) {
//        final int plus = 1;
//        final int minus = 2;
//        final int multiplication = 3;
//        var randomOperator = "";
//
//        switch (randomNumber) {
//            case plus -> randomOperator = " + ";
//            case minus -> randomOperator = " - ";
//            case multiplication -> randomOperator = " * ";
//            default -> randomOperator =  "Unknown operator entered";
//        }
//        return randomOperator;
//    }
//
//    private static int getMathResult(int firstNumber, int secondNumber, int operatorNumber) {
//        final int plus = 1;
//        final int minus = 2;
//        final int multiplication = 3;
//        int mathResult = 0;
//
//        switch (operatorNumber) {
//            case plus -> mathResult = firstNumber + secondNumber;
//            case minus -> mathResult = firstNumber - secondNumber;
//            case multiplication -> mathResult = firstNumber * secondNumber;
//            default -> System.out.println("Unknown operator entered");
//        }
//        return mathResult;
//    }


}
