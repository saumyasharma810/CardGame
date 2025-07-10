package service;

import java.util.ArrayList;
import java.util.Collections;

public class PlayerDeck {

    private ArrayList<Card> deck;

    public PlayerDeck(){

    }

    public void addCard(Card card){
        this.deck.add(card);
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public int score() {
        int sumOfScores = 0;
        for(Card card:deck){
            sumOfScores+=card.getScore();
        }
        return sumOfScores;
    }
}
