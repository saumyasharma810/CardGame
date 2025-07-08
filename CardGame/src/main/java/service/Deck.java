package service;

import java.util.*;

public class Deck {

    private ArrayList<Card> cards;

    private int lastCardIndex;

    public Deck() {
        cards = new ArrayList<>() ;
        // Populate the deck with cards (e.g., using nested loops for ranks and suits)
        HashMap<String,Integer> ranks = new HashMap<>();
        ranks.put("A", 1);
        ranks.put("2", 2);
        ranks.put("3", 3);
        ranks.put("4", 4);
        ranks.put("5", 5);
        ranks.put("6", 6);
        ranks.put("7", 7);
        ranks.put("8", 8);
        ranks.put("9", 9);
        ranks.put("T", 0);
        ranks.put("J", 11);
        ranks.put("Q", 12);
        ranks.put("K", 13);

        String[] suits = {"C", "D", "H", "S"};
        for (String suit : suits) {
            for (Map.Entry<String, Integer> rank : ranks.entrySet()) {
                cards.add(new Card(rank.getValue(), rank.getKey(), suit));
            }
        }

        lastCardIndex = cards.size()-1;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card topCard() {
        return cards.remove(lastCardIndex--);
    }

}
