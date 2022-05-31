package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    static final String DESCRIPTION = "What number is missing in the progression?";

    public static void runProgression() {
        final int parameter1 = 1; //constant to define the minimum of a random number, can be modified
        final int parameter2 = 10; //constant to define the maximum of power of number, can be modified
        final int parameter3 = 0; //constant to define a random number generator to remote position in progression
        final int parameter4 = 9; //constant to define  random number generator to remote position in progression
        final int progressionLength = 10;

        String[][] tasks = new String[Engine.ROUNDS][Engine.QUESTION_AND_ANSWER];
        for (int round = 0; round < Engine.ROUNDS; round++) {
            int startNumber = Utils.getRandomNumber(parameter1, parameter2);
            int progressionStep = Utils.getRandomNumber(parameter1, parameter2);
            int remotePosition = Utils.getRandomNumber(parameter3, parameter4);

            int[] tempArray = new int[progressionLength];
            String[] progressionArr = new String[progressionLength];
            tempArray[0] = startNumber;
            progressionArr[0] = Integer.toString(tempArray[0]);

            for (int item = 1; item < progressionLength; item++) {
                tempArray[item] = tempArray[item - 1] + progressionStep;
                progressionArr[item] = Integer.toString(tempArray[item]);
            }

            var question = String.join(" ", progressionArr[remotePosition]);
            var answer = Integer.toString(startNumber + progressionStep * remotePosition);

            tasks[round][0] = question;
            tasks[round][1] = answer;
        }
        Engine.gameRun(DESCRIPTION, tasks);
    }

}
