package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void gameRun(String description, String[] questions, String[] answers) {
        int correctAnswers = 0; //amount of correct answers
        final int maxNumberCorrectAnswers = 3;
        int index = 0;

        Greet.inputName();
        System.out.println(description);

        do {
            System.out.println("Question: " + questions[index]);
            System.out.print("Your answer: ");
            Scanner inputAnswer = new Scanner(System.in);
            String userAnswer = inputAnswer.nextLine();

            if (userAnswer.equals(answers[index])) {
                System.out.println("Correct!");
                correctAnswers += 1;

            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + answers[index] + "'");
                System.out.println("Let's try again, " + Greet.getName());
                correctAnswers = 0;
            }

            index++;

        } while (correctAnswers < maxNumberCorrectAnswers);

        System.out.println("Congratulations, " + Greet.getName() + "!");
    }


}
