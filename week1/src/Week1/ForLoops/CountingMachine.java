package Week1.ForLoops;

import java.util.Scanner;

public class CountingMachine {

    public static void main(String[] args) {

        Scanner getNumber = new Scanner(System.in);

        int number;

        System.out.print( "Count to: " );
        number = getNumber.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.print( i + " " );
        }

        System.out.println();
    }
}
