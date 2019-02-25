package Week1.WhileLoops;

import java.util.Random;

public class DiceDoubles {

    public static void main(String[] args) {

        Random r = new Random();


        int roll1;
        int roll2;

        do {
            roll1 = r.nextInt(6) + 1;
            roll2 = r.nextInt(6) + 1;
            System.out.println("Roll 1 : " + roll1);
            System.out.println("Roll 2 : " + roll2);
            System.out.println("The total is: " + (roll1 + roll2));

        }
        while (roll1 != roll2);

    }

}
