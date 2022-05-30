package hexlet.code;
import java.util.Scanner;

public class Cli {

    public static void inputName() {
        System.out.println("\n" + "Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner setName = new Scanner(System.in);
        var name = setName.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
