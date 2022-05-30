package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;
    public static final int QUESTION_AND_ANSWER = 2;

    public static void gameRun(String gameDescription, String[][] tasks) {
        System.out.println("\n" + "Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner setName = new Scanner(System.in);
        var userName = setName.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameDescription);

        for (String[] task : tasks) {
            String question = task[0];
            String answer = task[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            Scanner inputAnswer = new Scanner(System.in);
            String userAnswer = inputAnswer.nextLine();

            if (userAnswer.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + answer + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
