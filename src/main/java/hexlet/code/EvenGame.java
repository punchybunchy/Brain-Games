package hexlet.code;

import java.util.Scanner;

public class EvenGame {
    public static void evenCheck() {
        final int a = 1; //minimum random number
        final int b = 10; // maximum power of number
        final int maxCorrectAnswers = 3;

        int successAnswer = 0;
        String correctAnswer;

        Greet.inputName();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        do {
            int randomNumber = a + (int) (Math.random() * b);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            Scanner inputAnswer = new Scanner(System.in);
            String answer = inputAnswer.nextLine();

            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                successAnswer += 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
                System.out.println("Let's try again, " + Greet.getName());
                successAnswer = 0;
            }
        } while (successAnswer < maxCorrectAnswers);
        System.out.println("Congratulations, " + Greet.getName() + "!");
    }
}
