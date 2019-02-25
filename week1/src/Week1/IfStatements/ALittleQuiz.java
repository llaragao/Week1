package Week1.IfStatements;

import java.util.Scanner;

public class ALittleQuiz {

    public static void main(String[] args) {
        Scanner getAnswer = new Scanner(System.in);
        char answer;
        int answer1, answer2, answer3, score = 0;

        System.out.println("Hi there! Are you ready for the quiz (y/n)? ");
        answer = getAnswer.nextLine().charAt(0);

        if (answer == 'y' || answer == 'Y'){
            System.out.println("Okay, here it comes!");
        }
        else if (answer == 'n' || answer == 'N') {
            System.out.println("Here it comes anyways!");
        }
        else {
            System.out.println("That's not an answer, but here it comes anyways!");
        }

        System.out.println();

        System.out.println("Q1) What is the capital of Alaska?");
        System.out.println("1) Melbourne");
        System.out.println("2) Anchorage");
        System.out.println("3) Juneau");

        System.out.print("> ");

        while (true) {
            answer1 = getAnswer.nextInt();
            if (answer1 >= 1 && answer1 <= 3) {
                break;
            }
            System.out.print("Try again, answer need to be 1,2 or 3: ");
        }

        System.out.println();

        if (answer1 == 3) {
            System.out.println("That's right!");
            score++;
        } else {
            System.out.println("Sorry, Juneau is the capital of Alaska.");
        }
        System.out.println();

        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
        System.out.println("1) yes");
        System.out.println("2) no");

        System.out.print("> ");

        while (true) {
            answer2 = getAnswer.nextInt();
            if (answer2 >= 1 && answer2 <= 2) {
                break;
            }
            System.out.print("Try again, answer need to be 1 or 2: ");
        }

        System.out.println();
        if (answer2 == 2) {
            System.out.println("That's right!");
            score++;
        } else {
            System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
        }
        System.out.println();

        System.out.println("Q3) What is the result of 9+6/3?");
        System.out.println("1) 5");
        System.out.println("2) 11");
        System.out.println("3) 15/3");

        System.out.print("> ");

        while (true) {
            answer3 = getAnswer.nextInt();
            if (answer3 >= 1 && answer3 <= 3) {
                break;
            }
            System.out.print("Try again, answer need to be 1,2 or 3: ");
        }

        System.out.println();
        if (answer3 == 2) {
            System.out.println("That's correct!");
            score++;
        } else {
            System.out.println("Sorry, 11 is the result.");
        }
        System.out.println();
        System.out.println("Overall, you got " + score + " out of 3 correct. Thanks for playing!");

    }

}
