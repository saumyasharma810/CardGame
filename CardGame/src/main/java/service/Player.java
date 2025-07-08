package service;

public class Player {

    private String name;
    private PlayerDeck playerDeck;

    public Player(String name, PlayerDeck playerDeck) {
        this.name = name;
        this.playerDeck = playerDeck;
    }

    public void addCard(Card card){
        this.playerDeck.addCard(card);
    }

    public void shuffleOthersDeck(){
        //
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
}
