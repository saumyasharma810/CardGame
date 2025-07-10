package service;

public class Card {

    private int score;
    private String suit;
    private String rank;

    public Card(int score, String suit, String rank){
        this.score = score;
        this.suit = suit;
        this.rank = rank;
    }

    public int getScore() {
        return score;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }
}
