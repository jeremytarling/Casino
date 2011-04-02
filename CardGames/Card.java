package Casino.CardGames;

public class Card {

    // declare two fields (instance variables that can only be set within the class)
    
    private String face;
    private String suit;
    
    // a constructor to make setting these fields a requirement of instantiating a card object
    
    public Card(String cardFace, String cardSuit) {
        
        face = cardFace;
        suit = cardSuit;
        
    }

    public String toString() {
        
        return face + " of " + suit;
        
    }
}
