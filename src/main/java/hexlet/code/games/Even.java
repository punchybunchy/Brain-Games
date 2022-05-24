package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    static final int a = 1; //constant to define the minimum of a random number, can be modified
    static final int b = 10; //constant to define the maximum of power of number, can be modified

    static String[] questions = new String[100]; // 100 questions max value of a questions pull
    static String[] answers = new String[100];

    static String description = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void runEven() {
        for (int i = 0; i < 100; i++) {
            int randomNumber = a + (int) (Math.random() * b);
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
