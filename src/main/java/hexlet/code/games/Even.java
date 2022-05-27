package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static void runEven() {
        final int parameter1 = 1; //constant to define the minimum of a random number, can be modified
        final int parameter2 = 10; //constant to define the maximum of power of number, can be modified
        final int amountOfGameRounds = 3;
        final int questionAndAnswer = 2;
        final String gameDescription = "Answer 'yes' if number even otherwise answer 'no'.";

        String[][] tasks = new String[amountOfGameRounds][questionAndAnswer];
        for (int round = 0; round < amountOfGameRounds; round++) {
            var question = Utils.getRandomNumber(parameter1, parameter2);
            var answer = "";

            answer = (question % 2 == 0) ? "yes" : "no";

            tasks[round][0] = Integer.toString(question);
            tasks[round][1] = answer;
        }
        Engine.gameRun(gameDescription, tasks);
    }
}
