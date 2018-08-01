import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player_1;
    Card card_1;
    @Before
    public void before(){
        player_1 = new Player("Wojtek");
        card_1 = new Card(SuitType.SPADE, NumberType.ACE);
    }

    @Test
    public void howManyCards() { assertEquals( 0, player_1.handCount());}

    @Test
    public void receiveCard() {
        player_1.receiveCard(card_1);
        assertEquals( 1, player_1.handCount());}
}
