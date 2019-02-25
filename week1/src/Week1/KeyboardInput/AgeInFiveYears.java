package Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {

    public static void main(String[] args) {
        Scanner getUser = new Scanner(System.in);
        String name;
        int age;


        System.out.println("Hello, what's your name? ");
        name = getUser.next();

        System.out.println("Hi " + name + ", how old are you? ");
        age = getUser.nextInt();

        System.out.println(name + ", did you know that in five years you will be " + (age + 5) + " years old? And five years ago you were " + (age -5) + "! Imagine that!");





    }
}
