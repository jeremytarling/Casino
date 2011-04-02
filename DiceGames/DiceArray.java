package Casino.DiceGames;

import java.util.Random;

public class DiceArray {

    public static void main(String[] args) {

        Random randomNumbers = new Random();

        int[] frequency; // declare an array reference called 'frequency' that will hold integers
        frequency = new int[7]; // initialise it with seven integers

        /*
        another, less verbose way of doing the above:
        int[] frequency = new int[7];
        */

        for (int roll = 1; roll <= 6000; roll++)
            ++frequency[1 + randomNumbers.nextInt(6)];

        System.out.printf("%s%10s\n", "Face", "Frequency");

        for (int face = 1; face < frequency.length; face++)
            System.out.printf("%4d%10d\n", face, frequency[face]);
    }
}

