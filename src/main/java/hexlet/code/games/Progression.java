package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    static final String DESCRIPTION = "What number is missing in the progression?";

    public static void runProgression() {
        final int parameter1 = 1; //constant to define the minimum of a random number, can be modified
        final int parameter2 = 10; //constant to define the maximum of power of number, can be modified
        final int progressionLength = 10;

        String[][] tasks = new String[Engine.ROUNDS][Engine.QUESTION_AND_ANSWER];
        for (int round = 0; round < Engine.ROUNDS; round++) {
            int startNumber = Utils.getRandomNumber(parameter1, parameter2);
            int progressionStep = Utils.getRandomNumber(parameter1, parameter2);
            int remotePosition = Utils.getRandomNumber(parameter1, parameter2) - 1;

            var progressionArr = getProgression(startNumber, progressionStep, progressionLength);
            progressionArr[remotePosition] = "..";

            var question = String.join(" ", progressionArr);
            var answer = Integer.toString(startNumber + progressionStep * remotePosition);

            tasks[round][0] = question;
            tasks[round][1] = answer;
        }
        Engine.gameRun(DESCRIPTION, tasks);
    }

    private static String[] getProgression(int startNumber, int progressionStep, int progressionLength) {
        String[] progressionArr = new String[progressionLength];
        progressionArr[0] = Integer.toString(startNumber);

        for (int item = 1; item < progressionLength; item++) {
            var currentItem = Integer.parseInt(progressionArr[item - 1]) + progressionStep;
            progressionArr[item] = Integer.toString(currentItem);
        }
        return progressionArr;
    }

}
