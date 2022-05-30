package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void runEven() {
        final int parameter1 = 1; //constant to define the minimum of a random number, can be modified
        final int parameter2 = 10; //constant to define the maximum of power of number, can be modified

        String[][] tasks = new String[Engine.ROUNDS][Engine.QUESTION_AND_ANSWER];
        for (int round = 0; round < Engine.ROUNDS; round++) {
            var question = Utils.getRandomNumber(parameter1, parameter2);

            String answer = (question % 2 == 0) ? "yes" : "no";

            tasks[round][0] = Integer.toString(question);
            tasks[round][1] = answer;
        }
        Engine.gameRun(DESCRIPTION, tasks);
    }
}
