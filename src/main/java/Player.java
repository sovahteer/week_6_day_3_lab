import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.hand = new ArrayList<Card>();
        this.name = name;
    }

    public String name(){
        return this.name;
    }

    public int handCount(){
        return this.hand.size();
    }

    public void receiveCard(Card card){
        this.hand.add(card);
    }

    public Card showCard(){
        return this.hand.get(0);
    }

}
