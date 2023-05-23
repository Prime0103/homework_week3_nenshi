package homework_week3;
import java.util.Scanner;
public class Programme_8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet between A to F : ");
        String alphabet = sc.nextLine();
        alphabetAf(alphabet);//Calling static method
        sc.close();
    }

    /**
     * This method is used to find city name as per alphabate between A to F
     * This is static method
     * @param alphabet
     */
    public static void alphabetAf(String alphabet) {
        String names[] = {"Ahmedabad", "Baroda", "Canada", "Dhaka", "East London", "Fulda"};
        if (alphabet.equalsIgnoreCase("A")) {
            System.out.println("city : " + names[0]);
        } else if (alphabet.equalsIgnoreCase("B")) {
            System.out.println("city : " + names[1]);
        } else if (alphabet.equalsIgnoreCase("C")) {
            System.out.println("city : " + names[2]);
        } else if (alphabet.equalsIgnoreCase("D")) {
            System.out.println("city : " + names[3]);
        } else if (alphabet.equalsIgnoreCase("E")) {
            System.out.println("city : " + names[4]);
        } else if (alphabet.equalsIgnoreCase("F")) {
            System.out.println("city : " + names[5]);
        } else {
            System.out.println("Invalid Alphabet please enter between A to F");
        }
    }

}
