package Casino.CardGames;

public class DeckOfCardsTest {

    public static void main(String[] args) {

        DeckOfCards myDeckOfCards = new DeckOfCards();

        myDeckOfCards.shuffle();

        for (int i=1; i<=52; i++) {

            System.out.printf("%-19s", myDeckOfCards.dealCard());

            // print a newline every 4 cards
            if (i % 4 == 0)
                System.out.println();

        } // end for

    } // end main()

} // end class
