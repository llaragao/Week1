package Week1.KeyboardInput;

import java.util.Scanner;

public class MoreUserInputOfData {

        public static void main(String[] args) {

            Scanner getUser = new Scanner(System.in);
            String firstName;
            String lastName;
            int grade;
            int studentID;
            String login;
            double GPA;

            System.out.println("Please enter the following!");

            System.out.print("First name: ");
            firstName = getUser.next();

            System.out.print("Last name: ");
            lastName = getUser.next();

            System.out.print("Grade (9-12): ");
            while (true) {
                grade = getUser.nextInt();
                if (grade >= 9 && grade <= 12) {
                    break;
                }
                System.out.println("Try again, Grade need to be between (9-12): ");
            }

            System.out.print("Student ID: ");
            studentID = getUser.nextInt();

            System.out.print("Login: ");
            login = getUser.next();

            System.out.print("GPA (0.0-4.0): ");
            GPA = getUser.nextDouble();


            System.out.println("Your information:");
            System.out.println("Login: " + login);
            System.out.println("ID   : " + studentID);
            System.out.println("Name : " + lastName + ", " + firstName);
            System.out.println("GPA  : " + GPA);
            System.out.println("Grade: " + grade);
        }
    }
