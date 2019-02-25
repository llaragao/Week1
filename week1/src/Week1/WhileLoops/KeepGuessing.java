package Week1.WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {

    public static void main(String[] args) {

        Scanner getUser = new Scanner(System.in);
        Random r = new Random();

        int guess;
        int number;

        number = 1 + r.nextInt(10);

        System.out.println( "I have chosen a number between 1 and 10. Try to guess!" );
        System.out.print( "Your guess: " );
        guess = getUser.nextInt();

        while ( guess != number ) {
            System.out.println( "Nopes! Try again." );
            System.out.print( "Your guess: " );
            guess = getUser.nextInt();
        }

        System.out.println( "That's right! Awesome!" );

    }
}
