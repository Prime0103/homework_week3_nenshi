package homework_week3;
import java.util.Scanner;
public class Programme_1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + evenOdd);

    }
}

