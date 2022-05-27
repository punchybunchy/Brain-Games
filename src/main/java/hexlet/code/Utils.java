package hexlet.code;

public class Utils {
    public static int getRandomNumber(int parameter1, int parameter2) {
        int intRandomNumber = parameter1 + (int) (Math.random() * parameter2);
        return intRandomNumber;
    }
}
