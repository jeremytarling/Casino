package Casino.CardGames;

import java.util.Random;

public class DeckOfCards {

    // declare an array of type Card objects (i.e. a reference type) called 'deck'
    private Card[] deck;

    // field for a specific card
    private int currentCard;

    // set the number of cards in a deck as a constant
    private static final int NUMBER_OF_CARDS = 52;

    //random number generator, for shuffling etc.
    private static final Random randomNumbers = new Random();

    // constructor to build the deck

    public DeckOfCards() {

        // declare and populate two arrays, one for the suits and one for Card.face and one for Card.suit
        String[] faces = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};

        // initialise the deck array that can hold 52 card objects
        deck = new Card[NUMBER_OF_CARDS];

        // set currentCard to zero (so first card dealt is deck[0]
        currentCard = 0;

        // populate deck[] with card objects
        for (int count = 0; count<deck.length; count++)
            deck[count] = new Card( faces[count % 13], suits[count / 13]);
    } // end of constructor

    // shuffle those cards
    public void shuffle() {

        // after shuffling sealing should start at zero again
        currentCard = 0;

        /*
        so we can shuffle the 52 cards, we need three variables representing card positions in the deck[]:
         1. the initial position of a card object in the deck[] array (deck[first])
         2. the position of a randomly selected card from the deck[] array (deck[random])
         3. a temporary variable to hold to initial position when we overwrite it with the randomly generated position
        */
        for (int first = 0; first < deck.length; first++) {

            int random = randomNumbers.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[first];

            deck[first] = deck [random];

            deck[random] = temp;
        } // end for loop

    } // end of shuffle()

    // deal one card (return type is a Card object :)
    public Card dealCard() {

        if (currentCard < deck.length) // if there's a card available
            return deck[currentCard++]; // return it and increment currentCard by 1
        else
            return null;
    } // end dealCard()

} // end DeckOfCards class