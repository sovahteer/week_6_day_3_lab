import java.util.ArrayList;

public class Dealer {
    private Deck deck;
        Card card_1;
        Card card_2;
        Player winner;

    public Dealer(){
        this.deck = new Deck();
    }

    public int cardCount(){
        return this.deck.cardCount();
    }

    public void giveCardTo(Player player){
        Card card =  this.deck.giveCard();
        player.receiveCard(card);
    }

    public String compareCards(Player player1, Player player2) {
        this.giveCardTo(player1);
        this.giveCardTo(player2);
//take p1 card
        card_1 = player1.showCard();

//take p2 card
        card_2 = player2.showCard();

//comapre
        winner = player2;
        if (card_1.getNumber().getNumericValue() == card_2.getNumber().getNumericValue()) {
            if (card_1.getSuit().getRank() > card_2.getSuit().getRank()) {
                winner = player1;
            } else if (card_1.getNumber().getNumericValue() > card_2.getNumber().getNumericValue()) {
                winner = player1;
            }
//shout winner
        }
        return winner.name();
    }
    }
