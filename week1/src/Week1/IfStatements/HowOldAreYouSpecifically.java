package Week1.IfStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {

    public static void main(String[] args) {
        Scanner getUser = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Hello, what's your name? ");
        name = getUser.next();

        System.out.println("Okay " + name + ", how old are you? ");
        age = getUser.nextInt();


        if (age < 16) {
            System.out.println("You can't drive.");
        }
        else if (age < 18) {
            System.out.println("You can drive but not vote.");
        }
        else if (age < 25) {
            System.out.println("You can vote but not rent a car.");
        }
        else {
            System.out.println("You can do pretty much anything.");
        }


    }
}
