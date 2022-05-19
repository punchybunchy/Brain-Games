package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        Scanner inputNumber = new Scanner(System.in);
        int chosenNumber = inputNumber.nextInt();
        System.out.println("Your choice: " + chosenNumber);

        if (chosenNumber == 1) {
            Greet.inputName();
        } else if (chosenNumber == 2) {
            EvenGame.evenCheck();
        }
    }
}
