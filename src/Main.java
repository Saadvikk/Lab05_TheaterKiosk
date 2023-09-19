import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();


        if (age >= 21)
        {
            System.out.println("Since you are older than 21, you get a wristband! ");
        }
        else
        {

        }


        scanner.close();
    }
}