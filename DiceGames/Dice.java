package Casino.DiceGames;

/**
 * Created by IntelliJ IDEA.
 * User: tarlij01
 * Date: 23/03/11
 * Time: 19:32
 * To change this template use File | Settings | File Templates.
 */

import java.util.Random;

public class Dice {

    public static void rollDice() {

        Random randomNumber = new Random();

        int face = 1 + randomNumber.nextInt(5);

        System.out.println("you rolled a " + face);

    }

}
