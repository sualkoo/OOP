import Student.Student;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] student = new Student[3];

        //3.1 filling array of students
       /* for (int i = 0; i < 3; i++) {
            System.out.println("Type name: ");
            String name  = scanner.next();
            System.out.println("Type surname: ");
            String surname  = scanner.next();
            int random = ThreadLocalRandom.current().nextInt(18,40);
            student[i] = new Student(i, name, surname, random);
        }*/
        sortStudents();
    }

    //3.2 array sort
    public static void sortStudents()
    {
        Student[] student = {
                new Student(1,"Martin", "Laus", 23),
                new Student(2,"Martin", "Zofcik", 23),
                new Student(3,"Robert", "Jacko", 23),
                new Student(5,"Juraj", "Paska", 25),
                new Student(4,"Jozef", "Olejnik", 25),
                new Student(6,"Adam", "Martiska", 25)
        };
        Arrays.sort(student);
        System.out.println(Arrays.asList(student));
    }
}