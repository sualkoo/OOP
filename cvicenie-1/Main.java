import java.util.Scanner;

public class Main
{
    public static int equals(int x, int y)
    {
        if (x > y)
            return 1;
        else if (x < y)
            return -1;
        else
            return 0;
    }
    public static void main(String args[])
    {
        System.out.println("Hello World");
        System.out.println("Give me first number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            System.out.println("Give me second number: ");
            int y = sc.nextInt();
            System.out.println(equals(x, y));
        }
    }
}