package hexlet.code;
import java.util.Scanner;

public class Greet {

    private  static String name = "";

    public static void inputName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner setName = new Scanner(System.in);
        name = setName.nextLine();
        System.out.println("Hello " + name + "!");
    }

    public static String getName() {
        return name;
    }
}
