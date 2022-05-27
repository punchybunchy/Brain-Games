package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static String[] progGenerator(int startNumber, int progressionStep, int progressionLength,
                                         int remotePosition) {
        int[] tempArray = new int[progressionLength];
        String[] progressionArr = new String[progressionLength];
        tempArray[0] = startNumber;
        progressionArr[0] = Integer.toString(tempArray[0]);

        for (int item = 1; item < progressionLength; item++) {
            tempArray[item] = tempArray[item - 1] + progressionStep;
            progressionArr[item] = Integer.toString(tempArray[item]);
        }
        progressionArr[remotePosition] = "..";
        return progressionArr;
    }

    public static void runProgression() {
        final int parameter1 = 1; //constant to define the minimum of a random number, can be modified
        final int parameter2 = 10; //constant to define the maximum of power of number, can be modified
        final int parameter3 = 0; //constant to define a random number generator to remote position in progression
        final int parameter4 = 9; //constant to define  random number generator to remote position in progression
        final int progressionLength = 10;
        final int amountOfGameRounds = 3;
        final int questionAndAnswer = 2;
        final String gameDescription = "What number is missing in the progression?";

        String[][] tasks = new String[amountOfGameRounds][questionAndAnswer];
        for (int round = 0; round < amountOfGameRounds; round++) {
            int startNumber = Utils.getRandomNumber(parameter1, parameter2);
            int progressionStep = Utils.getRandomNumber(parameter1, parameter2);
            int remotePosition = Utils.getRandomNumber(parameter3, parameter4);

            var question = String.join(" ", progGenerator(startNumber, progressionStep,
                                                            progressionLength, remotePosition));
            var answer = Integer.toString(startNumber + progressionStep * remotePosition);

            tasks[round][0] = question;
            tasks[round][1] = answer;
        }
        Engine.gameRun(gameDescription, tasks);
    }
}
