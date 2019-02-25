package Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {

    public static void main(String[] args) {

        Scanner getUser = new Scanner(System.in);
        String name;
        int age;
        double salary;

        System.out.println("Hello there! What's your name? ");
        name = getUser.next();

        System.out.println("Hi, " + name +  "! How old are you?");
        age = getUser.nextInt();

        System.out.println("You're " + age + " years old!!! Oh fuck! How much you make per year, " + name + "?");
        salary = getUser.nextDouble();

        System.out.println("So " + name + ", at " + age + " years old you just make " + salary + "!? So... you're old and broke! Shit!");

    }
}

