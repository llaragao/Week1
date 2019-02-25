package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {

    public static void main(String[] args) {

        Scanner getNumber = new Scanner(System.in);

        int number;
        int total = 0;

        System.out.print("Enter a number: ");
        number = getNumber.nextInt();
        total += number;

        do {
            System.out.println("The total so far is: " + total);
            System.out.print("Enter another number: ");
            number = getNumber.nextInt();
            total += number;

        }
        while (number != 0);

        System.out.println();

        System.out.println("The total is " + total + ".");
    }
}
