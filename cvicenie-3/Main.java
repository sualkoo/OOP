import Student.Student;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] student = new Student[3];

        //3.1 filling array of students
        for (int i = 0; i < 3; i++) {
            System.out.println("Type name: ");
            String name  = scanner.next();
            System.out.println("Type surname: ");
            String surname  = scanner.next();
            int random = ThreadLocalRandom.current().nextInt(18,40);
            student[i] = new Student();
            student[i].setId(i);
            student[i].setName(name);
            student[i].setSurname(surname);
            student[i].setAge(random);
        }

        //3.2 TODO sorting the array


    }
}