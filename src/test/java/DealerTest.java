import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DealerTest {
    Card card;
    Player player_1;
    Player player_2;
    Deck deck_1;
    Dealer dealer;

    @Before
    public void before(){
        player_1 = new Player("Wojtek");
        player_2 = new Player( "Ilovdek");
        deck_1 = new Deck();
        dealer = new Dealer();
    }

    @Test
    public void startsFull(){ assertEquals (52, dealer.cardCount());}

    @Test
    public void giveCardToPlayer(){
        dealer.giveCardTo(player_1);
        assertNotNull(player_1.handCount());
    }
    @Test
    public void compareCards(){
        assertNotNull(dealer.compareCards(player_1, player_2));
    }
}
