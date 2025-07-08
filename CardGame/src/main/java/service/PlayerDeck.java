package service;

import java.util.ArrayList;

public class PlayerDeck {

    private ArrayList<Card> deck;

    public PlayerDeck(){

    }

    public void addCard(Card card){
        this.deck.add(card);
    }
}
