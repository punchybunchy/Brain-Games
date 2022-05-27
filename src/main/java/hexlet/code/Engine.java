package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void gameRun(String gameDescription, String[][] tasks) {
        final int numberOfAnswersToWin = 3;
        int correctAnswers = 0; //amount of correct answers

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
                correctAnswers += 1;
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + answer + "'");
                System.out.println("Let's try again, " + userName);
                break;
            }
        }
        if (correctAnswers == numberOfAnswersToWin) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
