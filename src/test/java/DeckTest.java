import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {
    Deck deck_1;
    Deck deck_2;
    Card card_2;

    @Before
    public void before(){
        deck_1 = new Deck();
        deck_2 = new Deck();
    }
    @Test
    public void shuffleDeck(){
        assertNotEquals(deck_1, deck_2);}

    @Test
    public void startsFull(){ assertEquals (52, deck_1.cardCount());}

    @Test
    public void giveCard() {
        deck_1.giveCard();
        assertEquals (51, deck_1.cardCount());
        assertNotEquals(null, deck_1.giveCard());

    }

}