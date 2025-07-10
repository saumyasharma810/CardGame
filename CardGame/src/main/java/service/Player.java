package service;

import java.util.Scanner;

public class Player {

    private String name;
    private PlayerDeck playerDeck;
    private Scanner sc =  new Scanner(System.in);

    public Player(String name, PlayerDeck playerDeck) {
        this.name = name;
        this.playerDeck = playerDeck;
    }

    public void addCard(Card card){
        this.playerDeck.addCard(card);
    }

    public void shuffleDeck(){
        playerDeck.shuffle();
    }

    public Player shuffleOthersDeck(){
        //
        return null;
    }

    public void ExchangeWithOtherPlayer(){

    }

    public void seeOneCard(){

    }

    public void discardTheCard(){

    }

    public void takeTheCard(){

    }

    public void declareWin(){

    }

    public boolean wantToDeclareWin() {
        // ask player do they want to declare win
        return false;
    }

    public Card askPlayer(Card cardDiscarded, Card topCard) {
        // 2 options
        return null;
    }

    public int score() {
        return this.playerDeck.score();
    }

    public boolean askWantDiscardedCard(Card cardDiscarded) {

        if (cardDiscarded == null) return false;

        // ask do you want to take discarded

        // if yes return true;

        //  else return false

        if(sc.nextLine().equalsIgnoreCase("yes")) {
            return true;
        }

        if(sc.nextLine().equalsIgnoreCase("no")) {
            return true;
        }

        return true;
    }

    public Card whichCardDiscarded(Card optionCard) {
        // aak for a card to be replaced with this.
        return null;

    }

    public boolean haveSameCard(Card cardDiscarded) {
        // ask for same card
        return true;

    }
}
