import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card aceOfSpades;

    @Before
    public void before() {
        aceOfSpades = new Card(SuitType.SPADE, NumberType.ACE);
    }

    @Test
    public void hasSuit() {
        assertEquals(SuitType.SPADE, aceOfSpades.getSuit());
    }

    @Test
    public void hasValue() {
        assertEquals(NumberType.ACE, aceOfSpades.getNumber());
    }
}