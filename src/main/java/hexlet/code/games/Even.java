package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    static final int A = 1; //constant to define the minimum of a random number, can be modified
    static final int B = 10; //constant to define the maximum of power of number, can be modified
    static final int ARR_SIZE = 100;
    private static String[] questions = new String[ARR_SIZE]; // 100 questions max value of a questions pull
    private static String[] answers = new String[ARR_SIZE];

    private static String description = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void runEven() {
        for (int i = 0; i < ARR_SIZE; i++) {
            int randomNumber = A + (int) (Math.random() * B);
            questions[i] = Integer.toString(randomNumber);
            if (randomNumber % 2 == 0) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
        }
        Engine.gameRun(description, questions, answers);
    }
}
