package cv2;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void horoskop(String date)
    {
        String[] parts = date.split(Pattern.quote("."));

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);

        switch (month) {
            case 1:
                if (day < 20)
                    System.out.println("Capricorn");
                else
                    System.out.println("Aquarius");
                break;
            case 2:
                if (day < 19)
                    System.out.println("Aquarius");
                else
                    System.out.println("Pisces");
                break;
            case 3:
                if (day < 21)
                    System.out.println("Pisces");
                else
                    System.out.println("Aries");
                break;
            case 4:
                if (day < 20)
                    System.out.println("Aries");
                else
                    System.out.println("Taurus");
                break;
            case 5:
                if (day < 21)
                    System.out.println("Taurus");
                else
                    System.out.println("Gemini");
                break;
            case 6:
                if (day < 21)
                    System.out.println("Gemini");
                else
                    System.out.println("Cancer");
                break;
            case 7:
                if (day < 23)
                    System.out.println("Cancer");
                else
                    System.out.println("Leo");
                break;
            case 8:
                if (day < 23)
                    System.out.println("Leo");
                else
                    System.out.println("Virgo");
                break;
            case 9:
                if (day < 23)
                    System.out.println("Virgo");
                else
                    System.out.println("Libra");
                break;
            case 10:
                if (day < 23)
                    System.out.println("Libra");
                else
                    System.out.println("Scorpio");
                break;
            case 11:
                if (day < 22)
                    System.out.println("Scorpio");
                else
                    System.out.println("Saggitarius");
                break;
            case 12:
                if (day < 22)
                    System.out.println("Saggitarius");
                else
                    System.out.println("Capricorn");
                break;
            default:
        }
    }

    public static void determinant(int arrayX[], int arrayY[])
    {

    }
    public static void main(String args[])
    {
        //2.1 Horoskop
         /*System.out.println("Zadaj svoj datum narodenia: (dd.mm.)");
        try (Scanner scanner = new Scanner(System.in)) {
            String date = scanner.next();
            horoskop(date);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } */

        //2.2 - 2.5 Definovanie a naplnenie pola
        int[] intArrayX = new int[3];
        int[] intArrayY = new int[3];
        int i = 0;
        while(i < intArrayX.length)
        {
            System.out.println("Zadaj prve cislo");
            Scanner scanner = new Scanner(System.in);
            intArrayX[i] = scanner.nextInt();
            System.out.println("Zadaj druhe cislo");
            intArrayY[i] = scanner.nextInt();
            i++;
        }

        Arrays.sort(intArrayX);
        Arrays.sort(intArrayY);
        for (i = 0; i<intArrayX.length; i++)
        {
            for(int j = 0; j< intArrayY.length-1; j++)
            {
                System.out.print(intArrayY[j]+" ");
            }
            System.out.println(intArrayX[i]+" ");
        }

        // 2.6 determinant
        determinant(intArrayX, intArrayY);
    }
}
