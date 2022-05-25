package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    static final int A = 1;
    static final int B = 10;
    static final int C = 10;
    static final int ARR_SIZE = 100;
    static final int PROG_SIZE = 10;
    private static String[] questions  = new String[ARR_SIZE];
    private static String[] answers = new String[ARR_SIZE];
    private static String description = "What number is missing in the progression?";

    public static int[] progGenerator() {
        int startNumber = A + (int) (Math.random() * B); // progression starts from this number
        int progressionStep = A + (int) (Math.random() * B); //on which value next item will be increased
        int[] progressionArr = new int[PROG_SIZE];
        progressionArr[0] = startNumber;

        for (int i = 1; i < PROG_SIZE; i++) {
            progressionArr[i] = progressionArr[i - 1] + progressionStep;
        }
        return progressionArr;
    }

    public static void runProgression() {

        for (int index = 0; index < B; index++) {

            int remotePosition = (int) (Math.random() * C); //which position needs to remove

            String tempStr = Arrays.toString(progGenerator()); //convert int array to temporary string
            String[] tempArr = tempStr.substring(1, tempStr.length() - 1).split(", ");

            //remove special symbol "[" "," "]" and convert string to a temporary string array

            answers[index] = tempArr[remotePosition];
            tempArr[remotePosition] = ".."; //replace and change to ".." one random number
            tempStr = Arrays.toString(tempArr);
            questions[index] = tempStr.substring(1, tempStr.length() - 1)
                    .replaceAll(", ", " "); //replace "," and "[", "]"
        }
        Engine.gameRun(description, questions, answers);
    }
}
