import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;
    private Card card;


    public Deck(){
        this.deck = new ArrayList<Card>();

        SuitType[] allSuits = SuitType.values();
        NumberType[] allNumbers = NumberType.values();

        for(NumberType number : allNumbers) {
            for (SuitType suit : allSuits) {
                Card newCard = new Card(suit, number);
                deck.add(newCard);
                Collections.shuffle(deck);
            }
        }
    }

    public int cardCount(){
        return this.deck.size();
    }

    public Card giveCard(){
        Card card = deck.get(0);
        this.deck.remove(card);
        return card;
    }
}
