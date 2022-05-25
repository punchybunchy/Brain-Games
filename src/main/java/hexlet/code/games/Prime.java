package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.ArrayUtils;

public class Prime {
    static final int A = 1;
    static final int B = 100;
    static final int C = 10;
    static final int ARR_SIZE = 100;
    private static String[] questions  = new String[ARR_SIZE];
    private static String[] answers = new String[ARR_SIZE];
    private static String description = "Answer 'yes' if given number is prime. "
                                        + "Otherwise answer 'no'.";

    private static String[] primeNumbers = {"2", "3", "5", "7", "11", "13", "17", "19", "23",
                                            "29", "31", "37", "41", "43", "47", "53", "59",
                                            "61", "67", "71", "73", "79", "83", "89", "97"};

    public static String[] questionsGenerator() {
        for (int index = 0; index < ARR_SIZE; index++) {
            questions[index] = Integer.toString(A + (int) (Math.random() * B));
        }
        return questions;
    }

    public static String[] answersGenerator() {
        for (int index = 0; index < ARR_SIZE; index++) {
            if (ArrayUtils.contains(primeNumbers, questions[index])) {
                answers[index] = "yes";
            } else {
                answers[index] = "no";
            }
        }
        return answers;
    }

    public static void runPrime() {
        questionsGenerator();
        answersGenerator();
        Engine.gameRun(description, questions, answers);
    }
}
