package homework_week3;
import java.util.Scanner;

/**
 *Write a java program to input any number and find out if it’s odd or even
 */
public class Programme_6
{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s1.nextInt();
        if(num % 2==0)
        {
            System.out.println("Number is even " +num);
        }
        else
        {
            System.out.println("Number is odd " +num);
        }

    }




}
