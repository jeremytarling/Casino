package Casino.DiceGames;

/**
 * Created by IntelliJ IDEA.
 * User: tarlij01
 * Date: 26/03/11
 * Time: 10:32
 * To change this template use File | Settings | File Templates.
 */
public class DiceTest {

    public static void main (String[] args) {

        System.out.println("This test rolls the dice five times by calling the static rollDice method of the Dice class (in a for loop)");

        for (int i=1; i<=5; i++) {

            System.out.print("this is roll " + i + ", and ");

            Dice.rollDice();

        }

    }

}
