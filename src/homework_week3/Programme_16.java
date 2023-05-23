package homework_week3;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”;
 */
public class Programme_16
{
    public static void main(String[] args) {
        int a = 10;
        if (a > 0){
            System.out.println("the number should be positive");
        } else if (a < 0) {
            System.out.println("the number should be negative");
        } else {
            System.out.println("the number is zero");
        }
    }
}
