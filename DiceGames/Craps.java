package Casino.DiceGames;

/**
 * Created by IntelliJ IDEA.
 * User: tarlij01
 * Date: 23/03/11
 * Time: 23:28
 * To change this template use File | Settings | File Templates.
 */

import java.util.Random;

public class Craps {

    private static final Random randomNumbers = new Random();

    private enum Status {CONTINUE, WON, LOST};

    private final static int SNAKE_EYES = 2;
    private final static int TREY = 3;
    private final static int SEVEN = 7;
    private final static int YO_LEVEN = 11;
    private final static int BOX_CARS = 12;

    public void play() {

        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();

        switch (sumOfDice) {

            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;

            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;

            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d\n", myPoint);
                break;
        } // end switch

        while (gameStatus == Status.CONTINUE) {

            sumOfDice = rollDice();

            if (sumOfDice == myPoint)
                gameStatus = Status.WON;
            else
                if (sumOfDice == SEVEN)
                    gameStatus = Status.LOST;
        }

        if (gameStatus == Status.WON)
            System.out.println("Player wins");
        else
            System.out.println("Player loses");

        } // end method play

    public int rollDice() {

        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d \n", die1, die2, sum);

         return sum;

    } //end method rollDice


} // end class Craps
